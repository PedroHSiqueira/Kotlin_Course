fun main() {
    println(media(5f,10f))
}

// varang permite que não tenho um numero especifico de parametros
fun media(vararg notas: Float): Float{
    var soma = 0f
    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}