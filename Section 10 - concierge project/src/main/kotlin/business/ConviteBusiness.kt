package business

class ConviteBusiness {
    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun codigoValido(codigo: String, tipo: String): Boolean{
        if (tipo == "comum" && codigo.startsWith("xt")){
            return true
        }else if ((tipo == "premium" || tipo == "luxo") && codigo.startsWith("xt")){
            return true
        }else{
            return false
        }
    }
}