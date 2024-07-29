object Task3 {
  // Function to compute the element-wise sum of two arrays
  def elementWiseSum(arr1: Array[Double], arr2: Array[Double]): Array[Double] = {
    require(arr1.length == arr2.length, "Arrays must have the same length")
    val result = new Array[Double](arr1.length)
    for (i <- arr1.indices) {
      result(i) = arr1(i) + arr2(i)
    }
    result
  }

  // Main function to test the elementWiseSum function
  def main(args: Array[String]): Unit = {
    val array1 = Array(1.0, 2.0, 3.0)
    val array2 = Array(4.0, 5.0, 6.0)
    val summedArray = elementWiseSum(array1, array2)
    println(summedArray.mkString(", "))
  }
}
