package exercicios

import java.util.*

fun fazerLoop(){
    val scanner = Scanner(System.`in`)

    print("Informe o número para o loop: ")
    val numero = scanner.nextInt()
    if (numero > 0){
        for (i in 1..numero step 2){
            println(i)
        }
    }

}