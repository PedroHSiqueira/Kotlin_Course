enum class Prioridade(val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade Baixa : $value"
        }
    },
    Media(5),
    Alta(15)
}

class Teste(prioridade: Prioridade)

// cria um gabarito de opções fixas
fun main() {
    Teste(Prioridade.Baixa)
    Teste(Prioridade.Media)
    Teste(Prioridade.Alta)

    for (p in Prioridade.entries) {
        println(p)
    }
}