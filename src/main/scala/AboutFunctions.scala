object AboutFunctions extends App {

  //    val foo:Function1[Int, Int] = new Function1[Int, Int]() {
  //      override def apply(x:Int):Int = {
  //        x + 1
  //      }
  //    }

  val foo: Int => Int = (x: Int) => x + 1
  val foo2: Function1[Int, Int] = (x: Int) => x + 1

  val bar = (x: Int, y: Int) => x + y
  val age = 38


  val myList = List(1, 2, 3, 4, 5)
  println(myList.map(foo))

  def applyFunction(a: Int, z: Int => Int) = z.apply(a)
  println(applyFunction(10, foo))

  def applyFunction2(a: Int, b:Int, z: (Int, Int) => Int) = z.apply(a, b)
  println(applyFunction2(10, 40, bar))

  println(myList.map((x:Int) => x + 1))

  val tupleList = List((1,4), (4, 10), (9, 16))

  //Tuple2[Int,Int]
  //(Int, Int)

  println(tupleList.map((t:(Int, Int)) => t._1 * t._2 ))
  println(tupleList.map((t:Tuple2[Int, Int]) => t._1 * t._2 ))
  println(tupleList.map(t => t._1 * t._2 ))
  println(tupleList.map(x => x._1 * x._2 ))
  println(tupleList.map{case (x, y) => x * y})  //Not enough info

  List("Eggs", "Milk", "Sponges", "Naan")


  import scala.language.postfixOps

  println(Set(1,2,3,4,5,6).map(10+))

  List(1,2,3,4,5)
  println(Set(1,2,3,4,5,6,7,8,9,10,10))
  println(Set(1,2,3,4,5,6,7,8,9,10,10).count(x => x == 10))

  println("----")
  Set(1,2,3,4,5,6) foreach println
  
}