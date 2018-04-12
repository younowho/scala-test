package main.scala

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  override def toString: String = number + "/" + denom

  def +(that: Rational): Rational = {
    new Rational(this.number * that.denom + that.number * this.denom, this.denom * that.denom)
  }

  def +(that: Int): Rational = {
    new Rational(this.number + that * this.denom, this.denom)
  }

  def *(that: Rational): Rational = {
    new Rational(this.number * that.number, this.denom * that.denom)
  }

  def *(that: Int): Rational = {
    new Rational(this.number * that, this.denom)
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  def this(n: Int) = this(n, 1)
}
