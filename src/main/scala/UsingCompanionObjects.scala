
object UsingCompanionObjects extends App {

  // Companion objects have the same name as the class
  // MUST BE IN THE SAME FILE

  val emp = Employee.apply("Maria")  //Using a factory!
  println(emp.firstName)
  println(emp.lastName)
  println(emp)


  class Foo(x:Int) {
    def apply(y:Int) = x + y
    def apply(z:Int, y:Int) = x + z + y
  }

  val f = new Foo(4)
  println(f.apply(10))
  println(f(10))
  println(f.apply(10, 40))
  println(f(10, 50))

  println(List.apply(1,2,3,4,5,6))
  println(List(1,2,3,4,5,6))

  val g = List.apply(1,2,3,4,5)
  println(g.apply(3))
}
