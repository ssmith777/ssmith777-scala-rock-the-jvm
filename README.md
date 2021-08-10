# scala-rock-the-jvm

## Functional Programming Rules
_*DO NOT USE LOOPS*_ 

Note: Scala does have loops if there is no other way around solving your paradigm 

#### Example Loop in Scala
```
 def doNotUseLoops(a: String, b: Int) = {
    var i = 0
    while (i < b) {
      println(a + " : " + i)
      i += 1
    }
  }
```
#### Alternitive to using a loop
``` 
  // This is an example of a Recursive Function 🤪
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " : " + aRepeatedFunction(aString, n-1) 
  }
```
### Functional Programming Notes:
- In Imperative languages like (Java, c++) you are executing a set of instructions (Do this, then that, then this). 
- In functional programming you execute expressions, Think "It gives me the value of something"