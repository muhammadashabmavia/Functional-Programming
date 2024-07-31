object ExercisePart2 {
  case class Address(street: String, city: String)

  object ExercisePasr2 {
    private var instance: Person = _

    def apply(name: String, age: Int, address: Address): Person = {
      if (instance == null) {
        instance = new Person(name, age, address)
      }
      instance
    }

    def getInstance: Person = instance
  }

  class Person(val name: String, val age: Int, val address: Address) {
    def copy(name: String = this.name, age: Int = this.age, address: Address = this.address): Person = {
      new Person(name, age, address)
    }

    override def toString: String = s"Person(name=$name, age=$age, address=$address)"
  }

  object MainApp {
    def main(args: Array[String]): Unit = {
      val originalPerson = ExercisePasr2("Alice", 30, Address("123 Main St", "Anytown"))

      val shallowCopiedPerson = originalPerson.copy()

      val deepCopiedPerson = originalPerson.copy(address = new Address(originalPerson.address.street, originalPerson.address.city))

      println("Original Person: " + originalPerson)
      println("Shallow Copied Person: " + shallowCopiedPerson)
      println("Deep Copied Person: " + deepCopiedPerson)
    }
  }

}
