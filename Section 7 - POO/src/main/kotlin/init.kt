class Animal(val especie: String) {
    var fala = ""

    //é usado assim que a classe for istanciada
    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }

    fun falar() {
        println(this.fala)
    }
}

fun main() {
    Animal("gato").falar()
}