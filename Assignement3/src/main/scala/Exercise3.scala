object Exercise3 {

  def main(args: Array[String]): Unit = {
    val vector = List(1, 2, 3, 4, 5)

    val norm = math.sqrt(vector.map(x => x * x).sum)

    println(s"The Euclidean norm of the vector is: $norm")
  }
}
