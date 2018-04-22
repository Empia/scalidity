package scalidity.terms

class BaseLine(expression: String) {
  def gen: String = s"${expression};"

  override def toString: String = gen
}
object BaseLine {
  def apply(expression: String) = new BaseLine(expression)
}