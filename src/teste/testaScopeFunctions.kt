package teste

import modelo.Endereco

fun testaScopeFunctions() {
    //    val endereco = Endereco(logradouro = "Rua Rebouças", numero = 513)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "Rebouças", numero = 513)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let { enderecoEmMaiusculo: String ->
            println(enderecoEmMaiusculo)
        }

    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
//        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rebouças"
            numero = 3185
        }

    listOf(Endereco(complemento = "casa"))
    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }


    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)
}
