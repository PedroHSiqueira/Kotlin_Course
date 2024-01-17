class Console private constructor(){
    companion object{
        fun readInt(msg: String): Int {
            var retorno: Int? = null

            do {
                print(msg)

                val info = readlnOrNull()

                if (info != null && info != "") {
                    retorno = info.toIntOrNull()

                    if (retorno == null || retorno <= 0) {
                        println("Valor Inválido")
                    }
                } else {
                    println("Valor Inválido")
                }
            } while (retorno == null || retorno <= 0)

            return retorno
        }

        fun readString(msg: String): String {
            var retorno: String? = null

            do {
                print(msg)
                val info = readlnOrNull()

                if (info != null && info != "") {
                    retorno = info.lowercase()
                }
            } while (retorno == null)
            return retorno
        }
    }
}