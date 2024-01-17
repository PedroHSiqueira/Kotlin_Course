package control

import business.ConviteBusiness

class Portaria {

    private val conviteBusiness = ConviteBusiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual a sua idade? ")
        if (idade < 18) {
            return "Acesso Negado, Menores de idade não são permitidos"
        }

        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        if (!conviteBusiness.tipoValido(tipoConvite)) {
            return "Negado. Tipo de convite Inválido."
        }

        val codigo = Console.readString("Qual é o codigo do convite? ")
        if (!conviteBusiness.codigoValido(codigo, tipoConvite)) {
            return "Negado. Tipo de codigo Inválido."
        }

        return "TODO!"
    }
}