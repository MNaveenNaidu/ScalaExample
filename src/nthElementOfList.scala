object nthElementOfList  {
def main(args:Array[String]){
  def nth[T](n:Int, l:List[T]) : T = l match {
case e::t if n==0 => e
case e::t if n>0 => nth(n-1,t)
case _ => throw new NoSuchElementException

}
println(nth(22, List(1, 1, 2, 3, 5, 8)))
}
}