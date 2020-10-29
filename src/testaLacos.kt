fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Guilherme $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0


        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {

        if (i == 4) {
            continue
        }
        val titular: String = "Guilherme $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0


        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()

    }
}
