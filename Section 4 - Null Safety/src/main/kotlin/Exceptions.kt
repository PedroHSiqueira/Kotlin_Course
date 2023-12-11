fun main() {
    try {
        val s: String? = null
        println(s!!.length)

        val numero = 10/0

    } catch (e: NullPointerException) {
        println("Variavel Nula!")
    }catch (e: ArithmeticException){
        println("Impossivel dividir por 0")
    }finally {
        println("Fim")
    }
}