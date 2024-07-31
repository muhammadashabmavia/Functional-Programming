object Exercise4 {

  def part1(args: Array[String]): Unit = {
    val uList = List(1, 2, 3, 4, 5)

    def g(x: Int): List[Int] = List(x, x * 2)

    val uListExtended = uList.map(g(_))
    println(s"Extended list using map: $uListExtended")

    val uListExtendedFlatMap = uList.flatMap(g(_))
    println(s"Extended list using flatMap: $uListExtendedFlatMap")
  }

  def part2(args: Array[String]): Unit = {
    val uList = List(1, 2, 3, 4, 5)

    val uListTwice = uList.map(_ * 2)
    println(s"List elements doubled: $uListTwice")

    val uListSquared = uList.map(x => if (x > 2) Some(x * x) else None)
    println(s"List elements squared selectively: $uListSquared")

  }

  def part3(args: Array[String]): Unit = {
    val uList = List(1, 2, 3, 4, 5)

    val uListTwice = uList.map(_ * 2)
    println(s"List elements doubled: $uListTwice")

    val uListSquared = uList.map(x => if (x > 2) Some(x * x) else None)
    println(s"List elements squared selectively: $uListSquared")

  }

  def part4(args: Array[String]): Unit = {
    val uList = List(1, 2, 3, 4, 5)

    def f(x: Int): Option[Int] = if (x > 2) Some(x) else None

    val uListSelective = uList.map { case x if f(x).isDefined => f(x) case _ => None }
    println(s"Selective elements of List using map: $uListSelective")

    val uListSelectiveFlatMap = uList.flatMap(f(_))
    println(s"Selective elements of List using flatMap: $uListSelectiveFlatMap")

  }

  def part5(args: Array[String]): Unit = {
    val uMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)

    val uMapMapValues = uMap.mapValues(_ * 2)
    println(s"Map values doubled using mapValues: $uMapMapValues")

    val uMapMap = uMap.map { case (k, v) => (k, v * 2) }
    println(s"Map values doubled using map: $uMapMap")

    val uMapFlatMap = uMap.flatMap { case (k, v) => Some(k -> (v * 2)) }
    println(s"Map values doubled using flatMap: $uMapFlatMap")

  }
}
