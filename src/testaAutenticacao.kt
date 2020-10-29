fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Guilherme",
        cpf = "123.456.789-00",
        senha =  1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1235)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente,1234)


}
