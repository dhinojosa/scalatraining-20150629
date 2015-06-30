
val n = 10
val result = if (n > 10) "Greater than 10"
             else if (n >= 10 && n < 20) "Greater than or equal 10, less than 20"
             else "Greater than 20"
println(result)

var x = 10
while(x > 0) { //Rarely going to use while loops
    println(x)
    x = x - 1
}

(1 to 10).reverse.foreach(println)

var y = 10
do {
   println(x)
   x = x - 1
} while ( x > 0) //because of java, rarely use

for (x <- List(1,2,3,4)) { //basic for loop, not a comprehension
     println(x)
}


