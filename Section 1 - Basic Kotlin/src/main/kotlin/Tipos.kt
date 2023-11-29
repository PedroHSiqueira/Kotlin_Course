/**
Tipo    bit

Double   64
Float    32
Long     63
Int      32
Short    16
Byte     8
Boolean  ?
Char     ?
String   ?

----------------
Não aceitam Negativos

ULong     63
UInt      32
UShort    16
UByte     8
 */

fun main() {

    var c: Char = 'A'
    var s: String = "Olá Meu Nome é Pedro"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    println("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")
    println("float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
    println("long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")
    println("int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
    println("short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
    println("byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")
}
