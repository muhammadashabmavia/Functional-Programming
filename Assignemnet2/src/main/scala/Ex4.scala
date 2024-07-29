object Ex4 {
def main(args: Array[String]): Unit ={
  // Arrays
  val numbersArray = Array(1, 2, 3, 4, 5)

  // Convert Array to List
  val numbersListFromArray = numbersArray.toList

  // head: Returns the first element
  val headElementFromArray = numbersListFromArray.head // Result: 1

  // tail: Returns all elements except the first one
  val tailElementsFromArray = numbersListFromArray.tail // Result: List(2, 3, 4, 5)

  // Printing results
  println(s"Head: $headElementFromArray")
  println(s"Tail: $tailElementsFromArray")

  //For higher order array

  val doubledArray = numbersArray.map(x => x * 2)

  val evenNumbersArray = numbersArray.filter(x => x % 2 == 0)

  numbersArray.foreach(x => println(s"Element: $x"))

  val sum = numbersArray.reduce((x, y) => x + y)

  println(s"Doubled Array: ${doubledArray.mkString(", ")}")
  println(s"Even Numbers Array: ${evenNumbersArray.mkString(", ")}")
  println(s"Sum: $sum")

}
}
