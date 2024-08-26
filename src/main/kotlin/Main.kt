package org.example

import java.util.*

//import exercicios.avaliaResultadoWhen
//import org.example.exercicios.avaliaResultadoIf
import exercicios.*


fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        print("")
        print("Digite a questão (1 - 10) ou 0 para sair: ")
        val opcao = scanner.nextInt()

        if (opcao == 0) {
            println("Saindo...")
            break
        }

        when (opcao) {
            1 -> {
                println("Questão 1: Cálculo de desconto")
                print("Informe o valor do produto: ")
                val valorProduto = scanner.nextDouble()
                print("Informe o percentual de desconto: ")
                val percentualDesconto = scanner.nextDouble()

                val valorFinal = calcularDesconto(valorProduto, percentualDesconto)

                println("O valor final do produto com desconto é: R$"+
                        calcularDesconto(valorProduto, percentualDesconto))
            }
            2 -> {
                println("Questão 2: Loop até entrada de zero")
                var total = 0.0
                while (true) {
                    print("Informe o valor do produto (ou 0 para sair): ")
                    val valorProduto = scanner.nextDouble()

                    if (valorProduto == 0.0) {
                        break
                    }

                    print("Informe o percentual de desconto: ")
                    val percentualDesconto = scanner.nextDouble()

                    val valorComDesconto = calcularDesconto(valorProduto, percentualDesconto)
                    total += valorComDesconto
                    println("Valor do produto com desconto: R$ $valorComDesconto\n")
                }
                println("O total acumulado dos produtos com desconto é: R$ $total\n")
            }
            3 -> {
                println("Questão 3: Avaliação de nota com IF")
                print("Informe uma nota entre 1 e 5: ")
                val nota = scanner.nextInt()

                val avaliacao = avaliaResultadoIf(nota)
                println(avaliacao)
            }
            4 -> {
                println("Questão 3: Avaliação de nota com IF")
                print("Informe uma nota entre 1 e 5: ")
                val nota = scanner.nextInt()

                val avaliacao = avaliaResultadoWhen(nota)
                println(avaliacao)
            }
            5 -> {
                calcularMediaWhile()
            }
            6 -> {
                fazerLoop()
            }

            else -> {
                println("Opção inválida. Digite um número entre 1 e 10, ou 0 para sair.")
            }
        }
    }

}

fun calcularDesconto(valor: Double, desconto: Double): Double {
    return valor - (valor * desconto / 100)
}

