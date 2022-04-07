package homework2

fun main() {
    print("Введите сумму перевода : ")
    val amount: Double = readln().toDouble()
    val fee: Double = (amount / 100) * 0.75
    if (amount >= 35) println("Комиссия составит $fee руб.")
    else println("Минимальная сумма перевода составляет 35 руб.")

}