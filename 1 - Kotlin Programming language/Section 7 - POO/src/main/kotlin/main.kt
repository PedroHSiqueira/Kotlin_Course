class Pessoa(val anoNascimento: Int = 2023, var nome: String){
    var documento: String = ""

    //construtor secundario precisa ter referencia ao construtor principal com os " : "
    constructor(anoNascimento: Int, nome: String, documento: String) : this(anoNascimento,nome){
        this.documento = documento
    }
    fun dormir():String{
        return "Dormindo"
    }

    fun acordar(): String{
        return "Acordei"
    }
}

fun main() {

    //Instancia de uma classe
    val pessoa: Pessoa = Pessoa(2004, "Pedro", "12346123612")
    println(pessoa.nome)
    println(pessoa.acordar())
    println(pessoa.dormir())
    println(pessoa.documento)
}