fun main () {
    val friends = arrayOf("Niko", "Kevser", "Widad")
    for (friend in friends) {
        greet(friend)
    }
}
    fun greet(name: String){
        println("Hello $name")
    }
