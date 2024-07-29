//In programming languages (especially functional programming languages) and type theory, an option type or maybe type is a polymorphic type that represents encapsulation of an optional value; e.g., it is used as the return type of functions which may or may not return a meaningful value when they are applied.

object Ex3 {

  def main(args: Array[String]): Unit ={
    val someString: Option[String] = Some("Hello, Ashab!")
    val noString: Option[String] = None

    // Process the Option values
    someString match {
      case Some(s) => println(s"The length of the string is ${s.length}")
      case None => println("No string provided")
    }

    noString match {
      case Some(s) => println(s"The length of the string is ${s.length}")
      case None => println("No string provided")
    }

  }

}
