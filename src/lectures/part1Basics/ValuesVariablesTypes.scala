package lectures.part1Basics

object ValuesVariablesTypes extends App {
  val x: Int = 42

  //val x = 42
  // Types are optional
  println(x)

  //x=2
  // VALS ARE IMMUTABLE

  // String
  val aString: String = "hello"

  // Boolean
  val aBoolean: Boolean = false

  // Char
  val aChar: Char ='a'

  // Int
  val anInt: Int = x

  // Short
  val aShort: Short = 22222

  // Long
  val aLong: Long = 1217777777777L

  // Float
  val aFloat: Float =2.0f

  // Double
  val aDouble: Double = 3.14

  //Variables
  var aVarable: Int = 4

  aVarable = 5 // Note: This is known as a side effect

  // Function Example
  def aFunc(a: Int, b: Int): Int = {
    return a * b
  }

  println(aFunc(1,3))

}
