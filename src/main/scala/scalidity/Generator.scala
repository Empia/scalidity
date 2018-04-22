package scalidity
import scalidity.terms._

object Generator {
  var terms: List[BaseTerm] = List(Pragma())

  def apply() {
    println(
      terms(0).gen
    )
  }
}