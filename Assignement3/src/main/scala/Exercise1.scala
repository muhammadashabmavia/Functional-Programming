object Exercise1 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7
    val quadraticFunction: Int => Int = x => a * x * x + b * x + c

    val rangeList = (-3 to 3).toList

    val mappedList = rangeList.map(quadraticFunction)

    println("Mapped List: " + mappedList.mkString(", "))

    val expectedResults = List(19, 9, 5, 7, 15, 29, 49)
    assert(mappedList == expectedResults, "The mapped list does not match")
    println("Verification successful: The mapped list matched")
  }
}
