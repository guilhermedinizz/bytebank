package teste

import modelo.Autenticavel
import modelo.SistemaInterno

fun testaHOF() {
    soma(1, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("soma sendo efetuada")
    resultado(a + b)
}