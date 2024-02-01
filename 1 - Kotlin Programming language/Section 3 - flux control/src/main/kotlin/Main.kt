fun main() {
    maiorIdade(15)
    maiorIdade(18)
    maiorIdade(8)

    println(saudacao(true))
    println(saudacao(false))

    range(15)
    range(55)
}

fun saudacao(dia: Boolean): String {
    return if (dia) {
        "Bom Dia"
    } else {
        "Boa Noite"
    }
}

fun maiorIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de Idade!")
    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor De Idade")
    }
}

//Operador de Range

fun range(num: Int){
    if(num in 1..50){
        println("Está entre 1 e 50")
    }else{
        println("Não está entre 1 e 50")
    }
}