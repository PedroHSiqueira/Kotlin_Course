fun main() {
    bonus("Gerente")
    bonusWhen("Coordenador")
}

fun bonus(cargo: String) {
    var bonus: Float = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else {
        bonus = 500f
    }

    println("O bonus ficou em R$$bonus")
}

//WHEN simplificado, mas ele pode vir com a estrutura do IF ELSE acima
fun bonusWhen(cargo: String): Float{
    return when (cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}