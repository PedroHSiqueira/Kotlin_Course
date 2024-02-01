fun main() {
    portaria()
}

fun quadrado() {

    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um Quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {

    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    println("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != ""
    ) {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("É um Triangulo Equilatero")
        } else {
            println("Não é um Triangulo Equilatero")
        }
    }
}

fun portaria() {
    println("Qual a sua idade?: ")
    val idade = readLine()

    if (idade != null && idade != "") {

        if (idade.toInt() < 18) {
            println("Menores de idade não são permitidos")
            return
        }
    }

    println("Qual a sue tipo de convite?: ")
    val convite = readLine()

    if (convite == "comum" || convite == "premium" || convite == "luxo") {
        println("Qual o codigo do convite?: ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (convite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if (convite == "premium" || convite == "luxo" && codigo.startsWith("xl")) {
                println("Welcome :)")
            } else {
                println("Acesso Negado")
            }
        }
    } else {
        println("Acesso Negado")
    }
}
