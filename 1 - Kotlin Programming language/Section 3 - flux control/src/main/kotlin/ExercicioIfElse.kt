fun main() {
    bonus("Gerente", 2)
    bonus("Coordenador", 0)
}

fun bonus(cargo: String, anosFuncao: Byte) {
    var bonus: Float = 0f

    if (cargo == "Gerente") {
        if (anosFuncao < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (anosFuncao < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else {
        bonus = 500f
    }

    println("O bonus ficou em R$$bonus")
}