import java.awt.ComponentOrientation
import java.lang.Exception
import kotlin.Result as Result1

fun main() {
//    val car = Car("Tesla", "Red", 2,4)
//    car.move()
//    println("\n")
//    car.stop()

//    val view = View()
//    val button = Button("Login", "Center")
//    val roundButton = RoundButton("SingUp", "Center", 30)
//
//    view.draw()
//    button.draw()
//    roundButton.draw()

//    val success = Result.Success("SUCCESS!")
//    val Progress = Result.Progress("Progress".uppercase())
//
//    getData(success)
//    getData(Progress)



//val vehicle = Vehicle()
//    val car = Car("Tesla", "white")
//    val motor = Motor("jep", "Red")
//    car.startEngin()
//    motor.startEngin()


}





//interface Engin {
//    fun startEngin()
//}
//
//class Car(val name: String, val color: String): Engin {
//    override fun startEngin() {
//        println("car Engin start")
//    }
//}
//
//class Motor(val name: String, val color: String): Engin {
//    override fun startEngin() {
//        println("Motor Engin start")
//    }
//}

//abstract class Vehicle() {
//
//    abstract fun move()
//    abstract fun stop()
//}
//
//class Car(var name: String,var color: String, val engines: Int, val doors: Int): Vehicle() {
//
//    override fun move() {
//        TODO("Not yet implemented")
//    }
//
//    override fun stop() {
//        TODO("Not yet implemented")
//    }
//}


//fun getData(result: Result) {
//    when (result) {
//        is Result.Error.NonRecoverableError -> result.showMessage()
//        is Result.Error.RecoverableError -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//        is Result.Success -> result.showMessage()
//    }
//}
//
//sealed class Result(val message: String) {
//    fun showMessage() {
//        println("Result: $message")
//    }
//    class Success(message: String): Result(message)
//    sealed class Error(message: String): Result(message) {
//        class RecoverableError(val exception: Exception, message: String): Error(message)
//        class NonRecoverableError(val exception: Exception, message: String): Error(message)
//    }
//    class Progress(message: String): Result(message)
//}


//open class View() {
//    open fun draw() {
//        println("Drawing the View\n")
//    }
//}
//
//open class Button(val text: String, val orientation: String): View() {
//    override fun draw() {
//        println("Drawing the Button")
//        super.draw()
//    }
//}
//
//open class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
//    override fun draw() {
//        println("Drawing the RoundButton")
//        super.draw()
//    }
//}

//open class Vehicle(val name: String, val color: String) {
//    open fun move() {
//        println("$name is moving")
//    }
//    open fun stop() {
//        println("$name is stopped")
//    }
//}
//
//class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//    override fun move() {
//        num()
//        super.move()
//    }
//
//    override fun stop() {
//        super.stop()
//    }
//
//    fun num() {
//        println("$engines and $doors")
//    }
//}