abstract class Mamifero(nome: String) {
    fun acordar() {}

    fun dormir() {}

    abstract fun falar()
}

class Cachorro(nome: String) : Mamifero(nome) {
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