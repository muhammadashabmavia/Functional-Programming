object ExercisePart4 {
    def main(args: Array[String]): Unit = {
      val lst = List(1, 2, 3, 4, 5)

      processList(lst)
    }

    def processList(lst: List[Int]): Unit = {
      val sum = lst.sum

      println(s"The sum of the list is: $sum")
    }

}
