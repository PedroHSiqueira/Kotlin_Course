fun main() {

    //Map
    // para cada chave um valor deve ser adicionado / Em pares

    val map1 = mapOf<String, String>(Pair("Brasil", "Brasilia"), Pair("Japão", "Tokyo"))
    val map2 = mutableMapOf<String, String>(Pair("Brasil", "Brasilia"), Pair("Japão", "Tokyo"))

    println(map1.entries)
    println(map1.values)

    map2["Argentina"] = "Buenos Aires"

    println(map2)

    map2.remove("Brasil")
    map2.contains("Brasil")
    map2.clear()
}