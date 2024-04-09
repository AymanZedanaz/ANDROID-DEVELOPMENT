fun main(args: Array<String>) {
    val text: String? = null
//    println(text!!.length)

    val text2 = text ?: "this variable is null"
    println(text2)
}