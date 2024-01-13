interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event) {
        println("Abrindo Conexões")
        println("Salvando Valores")
        println("Sucesso. Conexões Fechadas")
        e.onSuccess()
    }
}

fun main() {
    val p = Programa()

    //Classe Anonima
    p.salvar(object : Event {
        override fun onSuccess() {
            println("OnSuccess")
        }
    })
}