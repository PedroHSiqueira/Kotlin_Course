interface Selvagem {
    fun atacar(){
        println("Hello World!")
    }
}

abstract class Mamifero(nome: String) {
    fun acordar() {}

    fun dormir() {}

    abstract fun falar()
}

//Selvagem implementada após a " , "
class Cachorro(nome: String) : Mamifero(nome), Selvagem {
    override fun falar() {
        println("Woof Woof")
    }
}

class Gato(nome: String) : Mamifero(nome) {
    override fun falar() {
        println("Nya Nya")
    }
}

fun main() {}