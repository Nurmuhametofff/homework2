package homework2

import kotlin.random.Random

fun main() {
    val musicLover: Boolean = Random.nextBoolean()
    print("Введите сумму предыдущей покупки : ")
    val price: Double = readln().toDouble()
    if (price < 1_000) {
        if (musicLover) {
            val saleMusicLovers: Double = price - (price / 100) * 1.0
            print("Ваша сумма с учетом скидки постоянного слушателя составит $saleMusicLovers руб.")
        } else println("Сумма составит $price руб.")

    } else if (price <= 10_000) {
        val sale100price: Double = price - 100
        if (musicLover) {
            val saleMusicLovers: Double = sale100price - (sale100price / 100)
            println("Ваша сумма с учетом всех скидок составит $saleMusicLovers руб.")
        } else println("Сумма со скидкой составит $sale100price руб.")

    } else if (price > 10_000) {
        val sale5: Double = (price.toDouble() / 100) * 5
        val sale5price: Double = price - sale5
        if (musicLover) {
            val saleMusicLovers: Double = sale5price - (sale5price / 100)
            println("Ваша сумма с учетом всех скидок составит $saleMusicLovers руб")
        } else println("Сумма с учетом скидки в $sale5 руб. составит $sale5price")
    }
}