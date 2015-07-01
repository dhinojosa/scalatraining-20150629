
object UsingTuples extends App {

   val t1 = (3, 10.0, "Candy Bar",
     new Employee("Ann", None, "Robertson"))

   println(t1._1)
   println(t1._2)
   println(t1._3)
   println(t1._4)

  val foo:Tuple2[Double, Int] = Tuple2.apply(10.00, 3) //Explicit
  val bar = (10.00, 3)

  val baz = (1, List(5,4,3,2), 10.0)


}
