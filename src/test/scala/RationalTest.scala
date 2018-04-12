package test.scala

import main.scala.Rational

object RationalTest {
  def main(args: Array[String]): Unit = {
    println(new Rational(1, 6) + new Rational(1, 3))
    println(new Rational(1, 6) * new Rational(2, 3))

    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println(x + y)
    println(x + x * y)
    println(x + 2)
    println(x * 2)
  }
}
