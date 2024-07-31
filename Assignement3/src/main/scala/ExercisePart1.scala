object ExercisePart1 {

  object State extends Enumeration {
    val Locked, Unlocked = Value
  }

  object Input extends Enumeration {
    val Coin, Push = Value
  }

  class Turnstile {
    private var state: State.Value = State.Locked

    def handleInput(input: Input.Value): Unit = {
      input match {
        case Input.Coin =>
          if (state == State.Locked) {
            state = State.Unlocked
            println("Coin inserted. Turnstile unlocked.")
          } else {
            println("Coin inserted. Turnstile already unlocked.")
          }
        case Input.Push =>
          if (state == State.Unlocked) {
            state = State.Locked
            println("Pushed through. Turnstile locked.")
          } else {
            println("Cannot push. Turnstile is locked.")
          }
      }
    }

    def getState: State.Value = state
  }

  def main(args: Array[String]): Unit = {
    val turnstile = new Turnstile

    turnstile.handleInput(Input.Coin)
    turnstile.handleInput(Input.Push)
    turnstile.handleInput(Input.Push)
  }
}
