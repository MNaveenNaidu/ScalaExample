object LastElement {
  def main(args: Array[String]) {
    def last(L: List[Int]) = L(L.size - 1)
    println(last(List(1, 1, 2, 3, 5, 8)))
  }

}
