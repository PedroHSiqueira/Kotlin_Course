fun main() {
    println(media(5f,10f))
}

fun media(vararg notas: Float): Float{
    var soma = 0f
    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}