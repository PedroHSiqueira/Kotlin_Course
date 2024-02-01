class Animal(val especie: String) {
    private var fala = ""
        // Getter e Setter
        get() {
            println("Acesso Getter")
            return field
        }
        set(value) {
            println("Acesso Setter")
            field = value
        }

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
    val animal = Animal("Cachorro")
    println(animal.especie)
    animal.falar()

}