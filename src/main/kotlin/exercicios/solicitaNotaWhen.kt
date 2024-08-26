package exercicios

fun avaliaResultadoWhen(nota: Int): String {
    return when (nota) {
        1 -> "Péssimo"
        2 -> "Ruim"
        3 -> "Satisfatório"
        4 -> "Bom"
        5 -> "Ótimo"
        else -> "Nota inválida"
    }
}
