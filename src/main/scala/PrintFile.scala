package main.scala

import scala.io.Source

/**
  * 用scala读取一个文件并打印
  */
object PrintFile {

  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("D:\\idea workspace\\scala-test\\src\\main\\scala\\PrintFile.scala").getLines().toList
    val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
    val maxWidth = widthOfLine(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLine(line)
      println(" " * numSpaces + line.length + " | " + line)
    }
  }

  def widthOfLine(s: String): Int = {
    s.length.toString.length
  }

}
