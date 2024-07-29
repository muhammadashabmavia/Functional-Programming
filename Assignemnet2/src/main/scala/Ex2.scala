import scala.collection.mutable

object Ex2 {

  def main(args: Array[String]): Unit = {

    //Mutable Set: Allows you to add and remove elements after the set has been created.

    val mutableSet: mutable.Set[Int] = mutable.Set(1, 2, 3) //creating mutable set

    mutableSet += 4 // Add elements

    mutableSet -= 2 // Remove elements

    println("Mutable Set: " + mutableSet) // Print the Set

    //Mutable Map: Allows you to add, update, and remove key-value pairs after the map has been created.

    import scala.collection.mutable

    // Create a mutable Map
    val mutableMap: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2)

    mutableMap += ("c" -> 3) // Add key-value pairs

    mutableMap("b") = 4 // Update values

    mutableMap -= "a" // Remove key-value pairs

    println("Mutable Map: " + mutableMap) // Print the Map

  }
}