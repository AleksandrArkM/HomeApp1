import kotlin.math.round

fun main() {
    println("Первая задача")
    println("Ваша комиссия в копейках:")
    val summ = 850
    val amount = summ * 100
    var comission = 35

    val likes = 1112

    val sumBuy = 19002
    val userLong = 1
    var sumTotal = 0.00

    if ((amount/100*75) > 3500) {
        comission = amount/100*75/100
    }
    println(comission)
    println("---------------")
    println("Вторая задача")
    if (((likes%10) == 1) && (((likes%100 >11)) || ((likes%100 <11)))) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }

    println("---------------")
    println("Третья задача")

    if ((sumBuy >= 1000) && (sumBuy <= 10000)) {
        sumTotal = sumBuy - 100.00
    } else if (sumBuy > 10001) {
        sumTotal = sumBuy * 0.95
    }

    if (userLong == 1) {
        sumTotal = sumTotal * 0.99
    }

    println("%.2f".format(sumTotal))
}