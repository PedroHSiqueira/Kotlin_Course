class Pessoa(val anoNascimento: Int = 2023, var nome: String){
    fun dormir():String{
        return "Dormindo"
    }

    fun acordar(): String{
        return "Acordei"
    }
}

fun main() {

    //Instancia de uma classe
    val pessoa: Pessoa = Pessoa(2004, "Pedro")
    println(pessoa.nome)
    println(pessoa.acordar())
    println(pessoa.dormir())
}