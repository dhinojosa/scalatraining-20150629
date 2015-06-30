//Employee.scala
import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String, 
               @BeanProperty val lastName:String)
