fun main() {

    //Set
    //não tem uma ordem a ser seguida e não aceita duplicada

    val set1: Set<String> = setOf<String>("Pelotas", "Porto alegre", "Bagé")
    val set2: MutableSet<String> = mutableSetOf<String>()

    set2.add("São Paulo")
    set2.remove("São Paulo")
    set2.contains("São Paulo")

    set2.clear()
}