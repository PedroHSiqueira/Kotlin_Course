fun main() {
    ex8("xxooox")
    ex8("xoxox")
}

fun ex1() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}

fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex3() {
    var j = 0
    for (i in 1..500) {
        j += i
    }

    println("$j")
}

fun ex4(n: Int) {
    var contador: Int
    for (i in 1..n) {
        contador = i

        for (j in 1..contador) {
            print("#")
        }
        println()
    }
}

fun ex5() {
    val balao = 7
    var numeroBaloes = 0

    while ((numeroBaloes * balao) + balao < 2000) {
        numeroBaloes++
    }

    print("$numeroBaloes balões")
}

fun ex6() {
    var contador = 0

    while (contador <= 50) {
        if (contador % 3 == 0 && contador % 5 == 0) {
            println("FizzBuzz")
        } else if (contador % 3 == 0) {
            println("Buzz")
        } else if (contador % 5 == 0){
            println("Fizz")
        }else{
            println(contador)
        }
        contador++
    }
}

fun ex7(str: String){
    var tamanho = str.lastIndex

    while (tamanho >= 0){
        print("${str[tamanho]}")
        tamanho--
    }
}

fun ex8(str: String){
    var contador = 0
    var contadorX = 0
    var contadorO = 0

    while (contador <= str.lastIndex){
        if (str[contador] == 'x'){
            contadorX++
        }else if(str[contador] == 'o'){
            contadorO++
        }else{
            continue
        }
        contador++
    }

    if (contadorX == contadorO){
        println("True")
    }else{
        println("False")
    }
}