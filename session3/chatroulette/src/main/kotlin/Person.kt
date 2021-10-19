open class Person (open val name: String) {
     fun introduce() {
        println("hello I am $name")
    }
    open fun talk() {

    }
}