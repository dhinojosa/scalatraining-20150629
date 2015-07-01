//Employee.scala

import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName: String,
               val middleName: Option[String],
               @BeanProperty val lastName: String)

object Employee {
  //factories
  //helpers
  //pattern matching

  //factory
  def apply(firstName: String) =
    new Employee(firstName, None, "Foo")

  def apply(firstName: String, lastName: String) =
    new Employee(firstName, None, lastName)
}