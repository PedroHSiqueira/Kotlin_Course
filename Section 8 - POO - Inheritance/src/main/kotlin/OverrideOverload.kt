open class Eletronico2(val marca: String) {
    private fun corrente(ativo: Boolean){}

    fun ligar(){
        corrente(true)
    }

    open fun desligar(){
        corrente(false)
    }
}

class Computador2(marca: String, val preco: Float) : Eletronico2(marca){
    override fun desligar(){
        save()
        super.desligar() // Usando o super para acessar a classe eletronico
    }

    fun save(){}
    fun save(a: Int){}
    fun save(a:Double){}
    fun save(a:Int, b:Double){}
}

fun main() {
    val c = Computador2("DELL", 4000f)

    c.ligar()
    c.desligar()


}
