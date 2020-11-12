package teste


fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("Executa como anonima")
        return a + b
    }

    println(minhaFuncaoAnonima(20, 10))


    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }

    println(calculadoraBonificacaoAnonima(1100.0))
}

fun testaFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->

        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0

    }
    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(1, 5))
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b


}
