fun main() {
    ex4(10)
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
fun ex4(n: Int){
    var contador = 0
    for (i in 1..n){
        contador = i

        for (n in 1..contador){
            print("#")
        }
        println()
    }
}