fun main() {
    println(filtro(false, 5f,10f, false, ""))
}

// Se tiver mais de um parametro o vararg deve ser o ultimo
fun <T, J> filtro(abc: J, vararg notas: T): Float{
    var soma = 0f
    for (n in notas){
        if (n is Float){
            soma += n
        }
    }
    println(abc)
    return soma
}