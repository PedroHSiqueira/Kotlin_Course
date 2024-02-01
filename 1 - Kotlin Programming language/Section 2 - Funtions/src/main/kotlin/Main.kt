fun main() {
    helloWorld()
    println("A soma de 200 e 4 é ${sum(200, 4)}")
    divisao(10f, 5f)
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

//Função completa
fun helloWorld() {
    println("Hello World!")
}

//Função Simplificada
fun divisao(a: Float, b: Float) = println(a / b)
