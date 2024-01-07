// Classe base
open class Maquina(val marca: String) {
    fun minhaMarca() {
        println("Sou da marca: $marca")
    }

    private fun somenteMaquina() {
        println("Esse método é acessível somente por instâncias da classe Maquina.")
    }
}

// Classe especializada
class Computador(marca: String, val preco: Float) : Maquina(marca)

fun main() {

    val comp = Computador("DELL", 4000f)
    comp.minhaMarca()
    comp.preco

    // Não acessível
    // comp.somenteMaquina()
}
