fun main() {
    val str: String? = "Hello"

    //Só é executada quando for diferente de nulo
    str?.let {
        println(it)
    }
}