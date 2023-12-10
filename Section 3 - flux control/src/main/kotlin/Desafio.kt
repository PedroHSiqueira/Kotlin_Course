fun main() {
    var patrimonioPaula = 0f
    var patrimonioAna = 0f
    val salario = 10000f
    var mes = 0

    do {
        patrimonioAna += (salario * 0.05f) + (salario * 0.05f) + (patrimonioAna * 0.002f)
        patrimonioPaula += (salario * 0.05f) + (patrimonioPaula * 0.008f)
        mes++
    }while (patrimonioAna > patrimonioPaula)

    println("$mes meses")
}