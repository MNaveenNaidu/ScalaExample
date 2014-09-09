object flatternAList {
def main(args:Array[String]){
  def flatten(x: Any) : List[Any] = {
    x match {
      case Nil => Nil
      case head :: xs => flatten(head) ::: flatten(xs)
      case q => List(q)
    }
  }
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
}