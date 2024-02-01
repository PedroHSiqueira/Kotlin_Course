package control

import business.ConvidadoBusiness
import entity.Convidado

class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual a sua idade? ")
        val convidado = Convidado(idade = idade)
        if (!convidadoBusiness.maiorDeIdade(convidado.idade)) {
            return "Acesso Negado, Menores de idade não são permitidos"
        }

        convidado.tipo = Console.readString("Qual é o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(convidado.tipo)) {
            return "Negado. Tipo de convite Inválido."
        }

        convidado.codigo = Console.readString("Qual é o codigo do convite? ")
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Tipo de codigo Inválido."
        }

        return "Welcome! :D"
    }
}