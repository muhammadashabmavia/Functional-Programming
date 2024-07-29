object Ex1 {

  def main(args: Array[String]): Unit = {

    //Factory Method
    println("\nUsing the Array Factory Method:")
    val array1 = Array(1, 2, 3, 4, 5)
    println(array1.mkString(", "))

    // Using the Array.fill Method
    println("\nUsing the Array.fill Method:")
    val array2 = Array.fill(5)(0) // Creates an array of 5 elements, all initialized to 0
    println(array2.mkString(", "))

    // Using Array.ofDim With 2 dimension with 2 row 3 column
    println("\nUsing Array.ofDim Method:")
    val array6 = Array.ofDim[Int](2, 3)
    array6(0)(0) = 1
    array6(0)(1) = 2
    array6(0)(2) = 3
    array6(1)(0) = 4
    array6(1)(1) = 5
    array6(1)(2) = 6
    println(array6.map(_.mkString(", ")).mkString("; "))
  }
}
