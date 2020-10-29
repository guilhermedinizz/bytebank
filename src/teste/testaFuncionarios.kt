package teste

import modelo.Analista
import modelo.CalculadoraBonificacao
import modelo.Diretor
import modelo.Gerente

fun testaFuncionários() {
    val guilherme = Analista(
        nome = "Guilherme",
        cpf = "111.111.111-11",
        salario = 2000.0
    )

    println("Nome: ${guilherme.nome}")
    println("CPF: ${guilherme.cpf}")
    println("Salario: ${guilherme.salario}")
    println("Bonificação: ${guilherme.bonificacao}")
    println()

    val joao = Gerente(
        nome = "João Pedro",
        cpf = "111.111.111-11",
        salario = 4000.00,
        senha = 1234
    )
    println("Nome: ${joao.nome}")
    println("CPF: ${joao.cpf}")
    println("Salario: ${joao.salario}")
    println("Bonificação: ${joao.bonificacao}")
    println()

    if (joao.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autentição")
    }
    println()

    val isabela = Diretor(
        nome = "Isabela",
        cpf = "111.111.111-11",
        salario = 6000.00,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${isabela.nome}")
    println("CPF: ${isabela.cpf}")
    println("Salario: ${isabela.salario}")
    println("Bonificação: ${isabela.bonificacao}")
    println("PLR: ${isabela.plr}")
    println()

    if (isabela.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autentição")
    }

    val elineide = Analista(
        nome = "Elineide",
        cpf = "111.111.111-11",
        salario = 4000.00
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(guilherme)
    calculadora.registra(joao)
    calculadora.registra(isabela)
    calculadora.registra(elineide)

    println("Total de Bonificação: ${calculadora.total}")
}
