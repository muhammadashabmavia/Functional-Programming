object Exercise2 {
  def main(args: Array[String]): Unit = {
    val a = 3
    val b = 5
    val c = 7

    val quadraticFunction: Int => Int = x => a * x * x + b * x + c

    val rangeList = (-3 to 3).toList

    val mappedList = rangeList.map(quadraticFunction)

    val indexedZippedList = rangeList.zip(mappedList).zipWithIndex.map {
      case ((x, fx), index) => (x, fx, index)
    }

    println("List of (x, f(x), index):")
    indexedZippedList.foreach(println)

    val meanValue = mappedList.sum.toDouble / mappedList.size
    println(s"\nMean value of f(x): $meanValue")

    val mean = indexedZippedList.find { case (_, fx, _) => fx == meanValue }

    mean match {
      case Some((x, fx, index)) => println(s"Tuple with mean value: (x = $x, f(x) = $fx, index = $index)")
      case None => println("No exact tuple with the mean value found.")
    }
  }
}
