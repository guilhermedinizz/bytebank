package modelo

import Exception.FalhaAutenticacaoException
import Exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel{
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser retirado: $valor"
            )
        }
        if(!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.deposita(valor)
    }

    fun saldo(): Double {
        return saldo
    }

}