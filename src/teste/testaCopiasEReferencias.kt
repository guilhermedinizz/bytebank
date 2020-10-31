package teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João Pedro", cpf = "222.222.222-22", senha = 4321)

    val contaJoao = ContaCorrente(joao, 1002)

    val maria = Cliente(nome = "Maria", cpf = "333.333.333-33", senha = 1234)

    var contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular.nome = "maria"
    contaJoao.titular.nome = "joao"
}