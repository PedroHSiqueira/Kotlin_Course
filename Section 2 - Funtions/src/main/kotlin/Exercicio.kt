fun main() {
    calculoTempo(2u)
    println(comprimento("Hello World!"))
    println(areaCubo(4u, 5u, 10u))
    println(conversorMilhas(20f))
    println(trocaCaracteres("abacate"))
}

fun calculoTempo(anos: UInt) {
    println("$anos anos Equivale a :")
    println("${anos * 12u} Meses")
    println("${anos * 365u} Dias")
    println("${anos * 8766u} Horas")
    println("${anos * 525960u} Minutos")
    println("${anos * 31557600u} Segundos")
    println()
}

fun comprimento(texto: String) = "${texto.length} caracteres de comprimento"

fun areaCubo(a: UInt, b: UInt, c: UInt) = "${a * b * c} De Area"

fun conversorMilhas(milhas: Float) = "${milhas * 1.6} Kilometros"

fun trocaCaracteres(texto: String) = texto.replace("a", "x", true)