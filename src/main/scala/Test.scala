package main.scala

object Test {

  def main(args: Array[String]): Unit = {
    val names = List("zhangsan", "lisi", "wangwu", "zhaoliu")
    val wideName = names.filter(_.length > 4)
    println(wideName)
  }

}
