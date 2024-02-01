fun main() {

    // o ? Sinaliza que a variavel pode ser nula
    val s :String? = readLine()

    // os !! serve para falar para o kotlin que nós vamos tratar
    // o erro manualmente
    println(s!!.length)
}