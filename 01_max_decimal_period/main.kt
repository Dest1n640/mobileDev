import java.util.Scanner

fun periodLength(n: Int): Int {
    var remainder = 1 % n
    var numbers: IntArray = intArrayOf()

    while (true) {
        if (remainder == 0) {
            return 0
        }
        if (remainder !in numbers) {
            numbers += remainder
            remainder = (remainder * 10) % n
        } else {
            val firstSeenAt = numbers.indexOf(remainder)
            return numbers.size - firstSeenAt
        }
    }
}

fun max_decimal_per(limit: Int): Pair<Int, Int> {
    var max_period = 0
    var max_number = 0

    for (i in 2..limit) {
        val period = periodLength(i)
        if (period > max_period) {
            max_period = period
            max_number = i
        }
    }

    return Pair(max_number, max_period)
}

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val (answ, max_period) = max_decimal_per(n)
    println(answ)
}
