fun main() {
    endereco("Street","City")
}

//ao colocar o "=" ele passa a ter um valor default
fun endereco(rua: String, cidade: String, numero: Number = 0){
    print("$rua da cidade $cidade numero $numero")
}

