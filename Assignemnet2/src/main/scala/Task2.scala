object Task2 {

  // Tail-recursive function to generate a list of characters from 'a' to 'z'
  def charArray(start: Int, end: Int = 122, acc: List[Char] = List()): List[Char] = {
    // Base case: if start exceeds end, return the accumulated list
    if (start > end) acc
    else {
      // Recursive case: add the current character to the accumulator and call the function with the next ASCII value
      charArray(start + 1, end, acc :+ start.toChar)
    }
  }

  // Main method
  def main(args: Array[String]): Unit = {
    val startAscii = 97 // ASCII value for 'a'
    val charList = charArray(startAscii) // Generate the list of characters from 'a' to 'z'
    println(charList) // Print the resulting list
  }
}
