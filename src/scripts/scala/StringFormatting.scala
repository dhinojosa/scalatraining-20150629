val description = "My name is %s %1$s and my age is %d".format("Dan", 22)

val name = "Dan"
val age = 22

val description2 = s"My name is ${name.reverse} and my age is $age"

println(description)
println(description2)
