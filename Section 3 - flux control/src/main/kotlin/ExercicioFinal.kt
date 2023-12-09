fun main() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }

    for (i in 50 downTo 1) {
        print("$i ")
    }

    var j = 0
    for (i in 1..500){
        j += i
    }

    println("$j")

}
