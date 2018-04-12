package main.scala

object ListTest {

  def main(args: Array[String]): Unit = {
    val emptyList = List() // Nil 创建空的List
    List("Cool", "tools", "rule") //  创建带有3个值的List[String]
    List("a", "b") ::: List("c", "d") //  叠加两个列表返回带 "a","b","c","d"的新List[String]

    val thrill = "Will" :: "fill" :: "unitl" :: Nil //  创建带有3个值的List[String]  其中::操作符的调用者是后面的对象

    println(thrill(2))  //  获取元素下标为2的值

    println(thrill.count(s => s.length == 4)) //  计算List中字符串长度为4的总数

    println(thrill.drop(2)) //  返回去掉前2个元素的List  List("until")

    println(thrill.dropRight(2))  //  返回去掉后2个元素的List List("Will")

    println(thrill.exists(s => s == "until")) //  判断是否包含 unitl 字符串

    println(thrill.filter(s => s.length == 4))  //  返回所有字符串长度为4的List List("Will","fill")

  }

}
