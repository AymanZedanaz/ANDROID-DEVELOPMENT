fun main(args: Array<String>) {
    val alarm = 12
    when(alarm){
        !in 1..6 -> println("the time is not in $alarm")
        1,2,3 -> println("the time1 is $alarm")
        4,5,6 -> println("the time2 is $alarm")
        7,8,9 -> println("the time3 is $alarm")
        in 10..12 -> println("the time is in $alarm")
        else -> println("the time4 is $alarm")
    }

    val text = when(alarm) {
        in 1..6 -> {
            "text1to6"
        }
        7,8,9 -> {
            "text7or8or9"
        }
        10,11 -> {
            "text10or11"
        }
        else -> {
            "12"
        }
    }
    println(text)

    val answer = when {
        alarm <= 10 -> "the number is on 1 to 10"
        alarm == 7 || alarm == 8 || alarm == 12 -> "the number is 7 or 8 or 12"
        else -> "cool"
    }
    println(answer)
}