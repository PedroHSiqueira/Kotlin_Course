fun main() {
    val str = "Programação em Kotlin"

    println("Tamanho da string: ${str.length} ")

    println("Posição (Index) 0 da String: ${str[0]}")
    println(str.startsWith("P"))
    println(str.endsWith("abs"))
    println(str.substring(0, 4))
    println(str.replace("Kotlin", "Kotlin e Java!"))
    println(str.lowercase())
    println(str.uppercase())
    println("  Hello World!      ".trim())
}