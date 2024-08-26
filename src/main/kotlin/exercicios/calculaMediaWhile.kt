package exercicios

import java.util.Scanner

fun calcularMediaWhile() {
    val scanner = Scanner(System.`in`)

    var total = 0.0
    var contador = 0
    var numero: Double

    println("Digite números positivos para calcular a média. Digite 0 para sair.")
    while (true) {
        print("Digite um número (ou 0 para finalizar): ")
        numero = scanner.nextDouble()

        if (numero <= 0) {
            break
        }

        total += numero
        contador++
    }

    if (contador > 0) {
        val media = total / contador
        println("Quantidade de números informados: $contador")
        println("Valor total: $total")
        println("Média: $media")
    } else {
        println("Nenhum número positivo foi informado.")
    }
}