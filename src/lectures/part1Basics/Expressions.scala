package lectures.part1Basics

object Expressions extends App {

    val x = 1 + 2  //EXPRESSIONS
    println(x)

    println(2 + 3 * 4)
    // Note: In Scala, operators are methods.
    // Scala follow normal order of precedence with operators
    // ( * / % + - )
    // Plus we have:
    // & (bitwise and)
    // | (bitwise or)
    // ^ (bitwise exclusive or)
    // << (bitwise left shift)
    // >> (bitwise right shift)
    // >>> (right shift with zero expression) <- Note: This operation is exclusive to Scala.

    println(1 == x); // evaluates to Boolean false

    // Logical Negation
    println(!(1 == x))
    // ! not
    // && and
    // || or

    var aVariable = 2
    // Note: These are all "Side Effects", they can only be performed on variables
    aVariable += 3 // Also works with -=, *=, /=
    println(aVariable)

    // Instructions (Something you tell the computer to do) vs Expressions (Has a value and/or a type)

    // Note: In Scala (or functional programing) all of your code will compute a "Value"

    // If Expression
    val aCondition = true
    val aConditionedVal = if(aCondition) 5 else 3 // IF EXPRESSION (Not a IF INSTRUCTION)
    println(aConditionedVal)

    // Loops => DON'T EVER DO THIS AGAIN, loops are a no no in function programming

    // This is imperative code - Functional Programming is Declarative by design
    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    // EVERYTHING in Scala is an Expression

    val aWierdValue = (aVariable = 3) // Unit === void
    println("Value of Unit : " + aWierdValue)

    // Note: Side Effects in Scala are actually Expressions returning Unit
    // Side Effects Examples:
    // - println() - type Unit
    // - whiles
    // - reassigning vars

    // Code Block: The Value of a block is the value of its last expression (in this case a String)
    val aCodeBlock = {
        val y =2
        val z = y + 1
        if (z > y) "hello" else "goodbye"
    }

    println("aCodeBlock : " + aCodeBlock)

}
