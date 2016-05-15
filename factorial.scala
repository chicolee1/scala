object HelloWorld {
   def main(args: Array[String]) {
      println("Hello, world!")
      println(factorial(4))
   }
   def factorial(n: Int): Int = {
       def loop(acc: Int, n: Int): Int =
       if (n==0) acc
       else loop(acc*n,n-1)
       loop(1,n)
   }
}
