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
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " : " + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Charvel Guitars Rock 🎸 ", 9))

}
