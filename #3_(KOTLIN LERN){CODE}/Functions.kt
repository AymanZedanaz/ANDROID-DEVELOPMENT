fun main() {
    sayHello("Ayman", 20)
    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData("Google")
    }else {
        showMessage()
    }
    val max = getMax(10, 20)
    println(max)

    val max2 = getMax(10, 20, 30)
    println(max2)

    val max3 = getMax(1.5, 2.0)
    println(max3)

    sendMessage()

    println(sum(1,2,3))

}

fun sayHello(name: String, age: Int) {
    println("Hello, $name Your age is $age")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There's no internet connection")
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b: Int, c:Int) =  if (a >= b && a >= c) a else if (b >= a && b >= c) b else c

fun sendMessage(name: String = "user", message: String = sendText()) {
    println("Name = $name and Message = $message")
}
fun sendText() = "some text!"

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number
    }
    return result
}