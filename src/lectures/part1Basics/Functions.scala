package lectures.part1Basics

object Functions extends App {
  println("Functions")

  // Note Functions can be done with or without {} <= code block
  def aFunction(a: String, b: String): String =
    a + " " + b
  println(aFunction("Shawn", "Smith"))

  // Note: A ParameterLessFunctions can be called with just its name
  def aParameterLessFunctions(): Int = 42
  println(aParameterLessFunctions())

  // This is an example of a Recursive Function 🤪
  // Note: That all recursive functions require a return type
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " : " + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Charvel Guitars Rock 🎸 ", 9))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  aFunctionWithSideEffects("Gibson SG")

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    aSmallerFunction(n, n-1)
  }
  println(aBigFunction(12))

  def greetingForKids(name: String, age: Int): String =
   s"Hi, my name is ${name} and I am ${age} years old"

  println(greetingForKids("Shawn", 45))

  // Another recursive function example
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(5))

  // Fibonacci Sequence
  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(5))
}
