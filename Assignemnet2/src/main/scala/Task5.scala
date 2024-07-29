object Task5 {
  def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
    data.map(element => (element, f(element))).toMap
  }

  def func(x: Int): Boolean = x % 2 == 0

  def main(args: Array[String]): Unit = {
    val lst = Array(1, 2, 3, 4, 5)
    val result = buildMap(lst, func)

    println(result)
  }
}
