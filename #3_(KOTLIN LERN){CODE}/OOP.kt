fun main() {
//    val car1 = Car()
//    car1.name = "Tesla"
//    car1.color = "Red"
//    car1.model = "s2"
//    car1.doors = 4
//
//    car1.move()
//    println("Name: ${car1.name}")
//    println("Color: ${car1.color}")
//    println("Model: ${car1.model}")
//    println("Doors: ${car1.doors}")
//    car1.stop()
//
//    val car2 = Car()
//    car2.name = "Ford"
//    car2.color = "Blue"
//    car2.model = "Mustang"
//    car2.doors = 2
//
//    println("\n")
//    car2.move()
//    println("Name: ${car2.name}")
//    println("Color: ${car2.color}")
//    println("Model: ${car2.model}")
//    println("Doors: ${car2.doors}")
//    car2.stop()
//
//    println("\n")
//    val phone = Mobile("samsung", "grand prime", "white")
//    phone.open()
//    println("Name: ${phone.name}")
//    println("Color: ${phone.color}")
//    println("Model: ${phone.model}")
//    phone.stop()

//    val user = User("Ayman")
//    user.favoretMove = "spaider man"
//    val friend = User("Mohamed", "Zedan")
//    val user3 = User(age = 12, name = "Ahmad", lastName = "zed")

//    println("\n")

//    println("Friend: ${user.name}")
//    println("Friend: ${user.lastName}")
//    println("Friend: ${user.age}")
//
//    println("\n")
//
//    println("Friend: ${friend.name}")
//    println("Friend: ${friend.lastName}")
//    println("Friend: ${friend.age}")

//    val result = Calculator.sum(10,2)
//    println(result)

//    val instance = Database.getInstance()
//    val instance2 = Database.getInstance()
//    println(instance)
//    println(instance2)

//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)

//    val user1 = User("Ayman", "Zedan", 20)
//    val user2 by lazy {
//        User("Eman", "Al",19)
//    }
//    println(user2.name)

//    for (direction in Direction.values()) {
//        println(direction)
//        println(direction.direction)
//        println(direction.distance)
//        direction.printData()
//        println("\n")
//    }

//    val direction = Direction.valueOf("east".uppercase())
//    when(direction){
//        Direction.WEST -> println("the direction is WEST")
//        Direction.EAST -> println("the direction is EAST")
//        Direction.NORTH -> println("the direction is NORTH")
//        Direction.SOUTH -> println("the direction is SOUTH")
//    }

//    val listView = ListView(arrayOf("name1", "name2", "name3", "name4"))
//    listView.ListViewItem().displayItem(1)

//    val aymanAccount = BankAccont("Ayman")
//    aymanAccount.deposit(1000)
//    aymanAccount.withdraw(500)
//    aymanAccount.deposit(-20)
//    aymanAccount.withdraw(-100)
//    val balance = aymanAccount.calculateBalance()
//    println("Balance is $balance")

}




class BankAccont(val AccountName: String) {
    private var balance: Int = 0
    private var transactions = mutableListOf<Int>()
    fun deposit(amount: Int) {
        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")
        } else {
            println("Can't deposit negative sums")
        }
    }
    fun withdraw(withdraw: Int) {
        if (-withdraw < 0) {
            transactions.add(-withdraw)
            this.balance += -withdraw
            println("$withdraw withdraw. Balance is now ${this.balance}")
        } else {
            println("Cannot withdraw negative sums")
        }
    }
    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}

class ListView(val items: Array<String>) {

    inner class ListViewItem() {

        fun displayItem(position: Int) {

            println(items[position])

        }
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 15),
    EAST("east", 20),
    WEST("west", 30);

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}

object Database {
    init {
        println("Database created")
    }
}

//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//        fun getInstance(): Database? {
//            if (instance == null){
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

class Calculator() {
    companion object {
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}

class User(var name: String, var lastName: String = "LastName", var age: Int = 0) {
//    var name: String = name
//        get() {
//            return field
//        }
//        set(value) {
//            field = value
//        }
//
//    init {
//        if (name.lowercase().startsWith("a")){
//            this.name = name
//        } else {
//            this.name = "User"
//            println("the name doesn't start with the letter 'a' or 'A'")
//        }
//    }

//    constructor(name: String): this(name, "lastName", 0) {
//        println("2end")
//    }
//    constructor(name: String, lastName: String): this(name, lastName, 0) {
//        println("3end")
//    }

//    lateinit var favoretMove: String

//    init {
//        println("User: $name was created")
//    }
}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("the car $name is moving")
    }

    fun stop() {
        println("the car $name is stopped")
    }
}

class Mobile(var name: String, var model: String, var color: String) {

    fun open() {
        println("the Mobile $name is opening")
    }

    fun stop() {
        println("the Mobile $name is stopped")
    }
}

