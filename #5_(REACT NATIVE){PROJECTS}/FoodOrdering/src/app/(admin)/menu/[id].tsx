import { View, Text, Image, StyleSheet, Pressable, ActivityIndicator } from "react-native"
import { Link, useLocalSearchParams, useRouter } from "expo-router";
import { Stack } from "expo-router";
import { defaultPizzaImage } from "@/components/ProdactListItem";
import { useState } from 'react';
import { useCart } from "@/providers/CartProvider";
import { PizzaSize, Tables } from "@/types";
import { FontAwesome } from "@expo/vector-icons";
import Colors from "@/constants/Colors";
import { useProduct } from "@/api/products";


const sizes: PizzaSize[] = ['S', 'M', 'L', 'XL']

const ProductDetailsScreen = () => {
  const { id: idString } = useLocalSearchParams();
  const id = parseFloat(
    typeof idString === 'string' ?
      idString
      :
      // @ts-ignore
      idString[0]
  )

  const {
    data: product,
    error,
    isLoading,
  } = useProduct(id)

  const { addItem } = useCart()

  const router = useRouter()

  const [selectedSize, setSelectedSize] = useState<PizzaSize>('M')

  const addToCart = () => {
    if (!product) {
      return;
    }
    addItem(product, selectedSize)
    router.push('/cart')
  }

  if (isLoading) {
    return <ActivityIndicator />;
  }
  if (error) {
    return <Text>Failed to fetch product</Text>;
  }

  return (
    <View>
      <Stack.Screen options={{
        title: 'Menu',
        headerRight: () => (
          <Link href={`/(admin)/menu/create?id=${id}`} asChild>
            <Pressable>
              {({ pressed }) => (
                <FontAwesome
                  name="pencil"
                  size={25}
                  color={Colors.light.tint}
                  style={{ marginRight: 15, opacity: pressed ? 0.5 : 1 }}
                />
              )}
            </Pressable>
          </Link>
        ),
      }} />
      <Stack.Screen options={{ title: product?.name }} />
      <Image source=
      // @ts-ignore
      {{ uri: product.image || defaultPizzaImage }} style={styles.image} 
      />
      
      <Text style=
      // @ts-ignore
      {styles.title}>${product.name}
      </Text>
      <Text style={styles.price}>
        ${
        // @ts-ignore
        product.price
        }
        </Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    backgroundColor: 'white',
    padding: 10,
    flex: 1,
  },
  image: {
    width: '100%',
    aspectRatio: 1,
    alignSelf: 'center',
  },
  subtitle: {
    marginVertical: 10,
    fontWeight: '600',
  },
  title: {
    fontSize: 20,
    fontWeight: 'bold'
  },
  price: {
    fontSize: 18,
    fontWeight: 'bold',
  },
})

export default ProductDetailsScreen;