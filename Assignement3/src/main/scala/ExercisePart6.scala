object ExercisePart6 {

  implicit def intToString(x: Int): String = x.toString

  def printString(x: String): Unit = println(x)

  def main(args: Array[String]): Unit = {
    val number: Int = 123
    printString(number)
  }
}
