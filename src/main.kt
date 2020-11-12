import modelo.Cliente
import modelo.ContaPoupanca
import modelo.Endereco
import teste.testaHOF

fun main() {
    testaHOF()

}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Guilherme", cpf = "444.444.444-44", senha = 123), 10001)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println("Simulação rendimento anual: $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rebouças"
        numero = 513
        bairro = "Bairro"
        cidade = "São Paulo"
        estado = "SP"
        cep = "00000-000"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}














