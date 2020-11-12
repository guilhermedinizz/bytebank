package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5, resultado = {valor ->
        println(valor)

    })
    somaReceiver(1, 5, resultado = {
        println(this)
    })

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistema = SistemaInterno()
    sistema.entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
    sistema.entraReceiver(autenticavel, 1234, autenticado = {
        pagamento()
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Soma sendo efetuada")
    resultado(a + b)
    println("Depois da soma")
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Soma sendo efetuada")
    val total = a + b
    total.resultado()
    println("Depois da soma")
}
