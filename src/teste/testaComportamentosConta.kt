package teste

import modelo.Cliente
import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaComportamentosConta() {

    val guiherme = Cliente(nome = "Guilherme Diniz", cpf = "111.111.111-11", senha = 1234)

    val contaGuilherme = ContaPoupanca(guiherme, 1000)
    contaGuilherme.deposita(200.0)

    val joao = Cliente(nome = "João Pedro", cpf = "222.222.222-22", senha = 4321)

    val contaJoao = ContaCorrente(joao, 1001)
    contaJoao.deposita(300.0)

    println(contaGuilherme.titular)
    println(contaGuilherme.numero)
    println(contaGuilherme.saldo())

    println(contaJoao.titular)
    println(contaJoao.numero)
    println(contaJoao.saldo())

    println("Depositando na conta do Guilherme")
    contaGuilherme.deposita(50.0)
    println(contaGuilherme.saldo())
    println("Depositando na conta do João Pedro")
    contaJoao.deposita(100.0)
    println(contaJoao.saldo())

    println("Sacando da conta do Guilherme")
    contaGuilherme.saca(250.0)
    println(contaGuilherme.saldo())

    println("Sacando na conta do Jão Pedro")
    contaJoao.saca(100.00)
    println(contaJoao.saldo())

    println("Transferencias da conta do João Pedro para o Guilherme")

    if (contaJoao.transfere(100.00, contaGuilherme)) {
        println("Tranferencias sucedida")
    } else {
        print("Falha na transferencia")
    }

    println(contaGuilherme.saldo())
    println(contaJoao.saldo())
}
