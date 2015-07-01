
object UsingOptions extends App {
  val a = Some(100)

  println(a.get)
  //100

  val b = None

  println(a.getOrElse(10))
  println(b.getOrElse(10))
  println(b.getOrElse("Giants"))

  val c = new Employee("Maria", Some("Quetzal"), "Gonzales")
  val d = new Employee("Maya", None, "Henderson")

  println(c.middleName.getOrElse("No middle name"))
  println(d.middleName.getOrElse("No middle name"))
}
