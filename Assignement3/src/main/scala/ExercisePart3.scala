import scala.concurrent.{Future, ExecutionContext}
import scala.util.{Try, Success, Failure}

implicit val ec: ExecutionContext = ExecutionContext.global

object ExercisePart3 {

  def main(args: Array[String]): Unit = {

    println("Listing 11.2: List Collection")
    val uList = List(1, 2, 3, 4, 5)

    val uList_Twice = uList.map(x => x * 2)
    println(s"List elements doubled: $uList_Twice")

    def f(x: Int): Option[Int] = if (x > 2) Some(x * x) else None
    val uList_Squared = uList.map(x => f(x))
    println(s"List elements squared selectively: $uList_Squared")

    println("\nListing 11.3: List Collection with flatMap")
    def g(v: Int): List[Int] = List(v - 1, v, v + 1)
    val uList_Extended = uList.map(x => g(x))
    println(s"Extended list using map: $uList_Extended")
    val uList_Extended_flatMap = uList.flatMap(x => g(x))
    println(s"Extended list using flatMap: $uList_Extended_flatMap")

    println("\nListing 11.4: Option in List")
    val uList_selective = uList.map(x => f(x))
    println(s"Selective elements of List using map: $uList_selective")
    val uList_selective_flatMap = uList.flatMap(x => f(x))
    println(s"Selective elements of List using flatMap: $uList_selective_flatMap")

    println("\nListing 11.5: Map Collection")
    val uMap = Map("a" -> 2, "b" -> 4, "c" -> 6)

    val uMap_doubled = uMap.mapValues(v => v * 2)
    println(s"Map values doubled using mapValues: $uMap_doubled")

    val uMap_transformed = uMap.map { case (k, v) => (k, v * 2) }
    println(s"Map values doubled using map: $uMap_transformed")

    val uMap_flatMap = uMap.flatMap { case (k, v) => List(Some(k -> v * 2)) }
    println(s"Map values doubled using flatMap: $uMap_flatMap")

    println("\nOption Collection")
    val opt = Some(3)
    val resultOptMap = opt.map(x => x * 2)
    println(s"Option map result: $resultOptMap")
    val resultOptFlatMap = opt.flatMap(x => if (x > 2) Some(x * 2) else None)
    println(s"Option flatMap result: $resultOptFlatMap")

    println("\nFuture Collection")
    val future = Future { 2 }
    val resultFutureMap = future.map(x => x * 2)
    resultFutureMap.onComplete {
      case Success(value) => println(s"Future map result: $value")
      case Failure(e) => println(s"Future map failed: $e")
    }

    val resultFutureFlatMap = future.flatMap(x => Future { x * 2 })
    resultFutureFlatMap.onComplete {
      case Success(value) => println(s"Future flatMap result: $value")
      case Failure(e) => println(s"Future flatMap failed: $e")
    }

    println("\nTry Collection")
    val tryValue = Success(5)
    val resultTryMap = tryValue.map(x => x * 2)
    println(s"Try map result: $resultTryMap")
    val resultTryFlatMap = tryValue.flatMap(x => Success(x * 2))
    println(s"Try flatMap result: $resultTryFlatMap")
  }
}
