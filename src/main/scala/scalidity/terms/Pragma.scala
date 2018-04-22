package scalidity.terms

class Pragma extends BaseTerm {
  def gen: String = {
    s"${ BaseLine(s"pragma solidity ^0.4.18") }"
  }
}

object Pragma {
  def apply() = new Pragma
}