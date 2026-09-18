fun mortal_fibonacci_rabbits(n: Int, m: Int ): Long{
  val rabbits = MutableList(m) { 0L }
  rabbits[0] = 1L
  for (month in 1..n-1){
    val newborns = rabbits.sum() - rabbits[0]
    rabbits.removeLast()
    rabbits.add(0, newborns)
  }
  return rabbits.sum()
}


fun main(){
  println("Количество кроликов: ")
  println(mortal_fibonacci_rabbits(85, 19))
}
