package homework2

fun main() {
    val likes = 11// (1..100).random()
    print("Понравилось $likes ")
    if (likes != 11 && (likes % 10 == 1) || likes == 1) {
        println("человеку")
    } else {
        println("людям")
    }
}