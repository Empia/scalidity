package example

object Hello extends Greeting with App {
  scalidity.Generator()
}

trait Greeting {
  lazy val greeting: String = "hello"
}
