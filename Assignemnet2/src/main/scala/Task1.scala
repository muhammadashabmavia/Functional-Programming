import scala.util.Random

object Task1 {

// check its prime or not
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else !(3 to math.sqrt(n).toInt by 2).exists(d => n % d == 0)
  }

  def performTask(): Unit = {
//15 random int btwn 50 to 500
    val randomList = List.fill(15)(Random.nextInt(451) + 50)

    // Filter the list to include only prime numbers
    val primeIterator = randomList.filter(isPrime).iterator

    // Sort the prime numbers and put them into a Map with their positions as keys
    val sortedPrimeMap = primeIterator.toList.sorted.zipWithIndex.map { case (num, index) => (index, num) }.toMap

    println(s"Random List: $randomList")
    println(s"Prime Map: $sortedPrimeMap")
  }

  // Main method
  def main(args: Array[String]): Unit = {
    performTask()
  }
}
