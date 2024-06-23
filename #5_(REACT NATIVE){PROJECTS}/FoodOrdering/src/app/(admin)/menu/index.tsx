import { View, FlatList, ActivityIndicator, Text } from 'react-native';
import ProdactListItem from '@components/ProdactListItem';
import { useProductList } from '@/api/products';


export default function MenuScreen() {

  const { data: products, error, isLoading } = useProductList();

  if (isLoading) {
    return <ActivityIndicator />
  }

  if (error) {
    return <Text>Failed to fetch products</Text>
  }

  return (
    <View>
      <FlatList
        data={products}
        renderItem={({ item }) => <ProdactListItem product={item} />}
        numColumns={2}
        contentContainerStyle={{ gap: 10, padding: 10 }}
        columnWrapperStyle={{ gap: 10 }}
      />
    </View>
  );
}

