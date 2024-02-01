fun main() {
    val f1: Forma = Forma(10,8)
    val f2: Forma = Forma(10,8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())

    val f3: FormaData = FormaData(10,8)
    val f4: FormaData = FormaData(10,8)

    println()
    println(f3.equals(f4))
    println(f3.toString())
    println(f3.hashCode())
    println("-------------")
    println(f4.toString())
    println(f4.hashCode())

    f3 == f4.copy(20,10)
}

class Forma (val a: Int, val b: Int){

    //Sobreescrevendo o metodo Equals
    override fun equals(other: Any?): Boolean {
        return if(other is Forma){
            (other.a == this.a && other.b == this.b)
        }else{
            false
        }
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b
        return result
    }
}
data class  FormaData (val a: Int, val b: Int)

data class Endereco(val rua: String, val cep: String, val city: String)
fun endereco(e: Endereco){}