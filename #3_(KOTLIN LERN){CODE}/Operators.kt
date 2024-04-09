fun main(args: Array<String>) {
    var x = 5
    var y = 3.0

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    x = 0

    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    var isActive = false
    if (!isActive){
        println("user is Active")
    }else {
        println("user is not Active")
    }

    var myNumber = 100
    if (myNumber > 150){
        println("the number is bigger than 150")
    }else if (myNumber <= 90){
        println("the number is bigger than 90")
    }else {
        println("the Condition failed ")
    }

    val isPlay = true
    val score = 80
    if (isPlay == true && score == 100){
        println("next level opened")
    } else {
        println("still at the same level")
    }

    val num1 = 5
    val num2 = 2
    if (num1 > 0 || num2 > 0){
        println("text 1")
    } else{
        println("text 2")
    }

    val text = if (num1 > 0 || num2 > 0) "text 1" else "text 2"
    println("$text!")
}