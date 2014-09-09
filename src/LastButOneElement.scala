object LastButOneElement {
  def main(args: Array[String]) {
    def penultimate(L: List[Int]) = L(L.size - 2)
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}