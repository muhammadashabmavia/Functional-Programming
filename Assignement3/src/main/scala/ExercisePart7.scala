object ExercisePart7 {

  implicit def anyToString[T](value: T): String = value.toString

  def printConcatenatedString[A, B](input1: A, input2: B): Unit = {
    val str1: String = input1
    val str2: String = input2

    println(str1 + str2)
  }

  def main(args: Array[String]): Unit = {
    printConcatenatedString("The result is ", 7 + 5)
  }
}
