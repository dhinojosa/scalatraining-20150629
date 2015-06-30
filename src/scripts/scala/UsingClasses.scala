case class Department(name:String) {//don't need val with case 
   override def toString = s"Department(name=${name})"
}
//   override def equals(x:Any) = {
//      if (!(x.isInstanceOf[Department])) false
//      else {
//         val other:Department = x.asInstanceOf[Department]
//         other.name == this.name
//      }
//   }
//   override def hashCode = {
//      name.hashCode % 33
//   }



class Employee(val firstName:String, 
               val lastName:String, 
               val department:Department) {

    require(firstName != "", "First name cannot be blank")  //precondition
    require(lastName != "", "Last name cannot be blank")    //precondition

    //ancillary constructor
    def this(firstName:String, lastName:String) = 
              this(firstName, lastName, Department("Toys"))

    def this() = this("Default", "Default")
}

class Manager(override val firstName:String, 
              override val lastName:String,
              override val department:Department, 
              val employees:List[Employee])
              extends Employee(firstName, lastName, department)

val e = new Employee("Rakesh", "Nanjangud")
println(e.firstName)
println(e.lastName)
println(e.department)

val f = new Employee()
println(f.firstName)
println(f.lastName)
println(f.department)

val d1 = new Department("Jewelry")
val d2 = new Department("Jewelry")

println(d1 == d2) //true

val m = new Manager("Raja", "Gottam", e.department, List(e))

println(m.employees.size)

try {
  new Employee("", "", d2)
} catch {
  case e:java.lang.IllegalArgumentException => {
     println(s"Caught exception ${e.getMessage}")
  }
}

