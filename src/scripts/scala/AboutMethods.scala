//method will always start with def
//Unit is the same as ()

def add(x:Int, y:Int) = x + y

def add2(x:Int, y:Int):Int = {  //more verbose version
   return x + y
}
def add3(x:Int, y:Int, z:Int):Unit = {
   x + y + z
}
def `add3$$`(x:Int, y:Int, z:Int) = x + y + z

def add4(x:Int, y:Int) = {  //1 vote int, 1 vote any *Winner*, 1 vote string
    if (x > 10) y + "foo"
    else x + y
}

println(add(40, 50)) //90
println(add2(40, 50)) //90
println(add3(40, 50, 100)) //() //Unit
println(add3$$(10, 20, 30)) //60

import scala.annotation.tailrec

def factorial(x:BigInt):BigInt = { //need return type
  @tailrec //compile time check 
  def factHelp(acc:BigInt, x:BigInt):BigInt = {
    if (x == 0) acc 
    else if (x == 1) acc
    else factHelp(x * acc, x-1)  // tail recursive
  }
  factHelp(1, x)
}

println(factorial(5))
println(factorial(1000))
println(factorial(10000))

class Foo(x:Int) {
   def ~:(y:Int) = x + y
   def :~(y:Int) = x + y + 10
}

val foo = new Foo(20)
println(foo.~:(5)) //25
println(5 ~: foo) //25
println(foo.:~(7)) //37
println(foo :~ 7) //37
//println(7 :~ foo) //Fail

println(List(1,2,3,100,4,5))
println(1 :: 2 :: 3 :: 100 :: 4 :: 5 :: Nil)

val col = List(1,2,3,4,5)

//col = List(5, 4, 100, 3, 5, 6, 10)//wrong
println(0 +: col :+ 6)
println(col) //1-5 3 vote, 0-6 2 vote
println((0 +: 1 +: 2 +: col).sorted)
println(col)

val colcopy = col :+ 10
println(col)
println(colcopy)















