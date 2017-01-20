

object LastElement {
  def main(args: Array[String]): Unit = {

    val list = List(10, 20, 30, 40, 50, 60)
    println(s"(${list(list.length - 1)}, ${list.length - 1})")
  }
}
