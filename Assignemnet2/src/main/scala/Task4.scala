object Task4 {
  def main(args: Array[String]): Unit = {
    val numbersArray = Array.fill(100)(util.Random.nextInt(100))

    // Recursive function to count even numbers
    def countEvensRecursive(arr: Array[Int]): Int = {
      if (arr.isEmpty) 0
      else (if (arr.head % 2 == 0) 1 else 0) + countEvensRecursive(arr.tail)
    }

    val evenCountRecursive = countEvensRecursive(numbersArray)
    println(s"Number of even values (recursive): $evenCountRecursive")
  }

  def main1(args: Array[String]): Unit = {
    val numbersArray = Array.fill(100)(util.Random.nextInt(100))

    // Using the count method to find even numbers
    val evenCountCountMethod = numbersArray.count(_ % 2 == 0)
    println(s"Number of even values (count method): $evenCountCountMethod")
  }

}
