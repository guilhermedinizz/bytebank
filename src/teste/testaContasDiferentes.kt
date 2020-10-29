package teste

import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Guilherme",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Joao",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println()

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    println()

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")

    println()

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo Poupança: ${contaPoupanca.saldo}")
}
