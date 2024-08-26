package exercicios

fun avaliaResultadoIf(nota: Int): String {
    return if (nota == 1) {
        "Péssimo"
    } else if (nota == 2) {
        "Ruim"
    } else if (nota == 3) {
        "Satisfatório"
    } else if (nota == 4) {
        "Bom"
    } else if (nota == 5) {
        "Ótimo"
    } else {
        "Nota inválida"
    }
}