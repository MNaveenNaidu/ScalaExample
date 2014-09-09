object ReversingAList {
  def main(args: Array[String]) {
    def reverse[A](list: List[A], result: List[A] = Nil): List[A] = list match {
      case Nil => result
      case (x :: xs) => reverse(xs, x :: result)
    }
    println(reverse(List(1, 1, 2, 3, 5, 8)))
  }

}