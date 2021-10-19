fun main() {
    //val persons = arrayOf(Person(name:"Lola"), Person(name:"Luca"))
    val persons = arrayOf(Comedian("Mike"), Teacher("Maaike", Student("Kylian"), Chatbot("widi"))
    //Array<Person>
    //Array<Class>
    //Array<Chatbot>

    val chatPartner = persons.random()
    chatPartner.introduce()
    chatPartner.talk()
}