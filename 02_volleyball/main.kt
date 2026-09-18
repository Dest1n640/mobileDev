import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun minRemainingBalls(k: Int, x: Int, y: Int): Int {
    val mx = max(x, y)
    val mn = min(x, y)
    val diff = mx - mn

    return when {
        mx < k - 1 -> k - mx
        diff == 0 -> max(2, k - mx)
        diff == 1 -> max(1, k - mx)
        else -> max(0, k - mx)
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()

    println(minRemainingBalls(k, x, y))
}
