fun main() {
    basicKotlinDataType()
    kotlinTypeNumbers()
    kotlinScientificNumbers()
    kotlinForBooleanTypes()
    kotlinForCharacters()
    kotlinForStringType()
    kotlinTypeConversion()
}

fun basicKotlinDataType()  {
    // In Kotlin, the type of variable is decided by its value:
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // However, you learned from the previous chapter that it is possible to specify the type if you want:
    val myNumSecond: Int = 5                // Int
    val myDoubleNumSecond: Double = 5.99    // Double
    val myLetterSecond: Char = 'D'          // Char
    val myBooleanSecond: Boolean = true     // Boolean
    val myTextSecond: String = "Hello"      // String

    /*
    * Data Types ar divided into different groups:
    * Numbers
    * Characters
    * Booleans
    * Strings
    * Arrays
    * */
}

fun kotlinTypeNumbers() {
    /*
    * Kotlin number type ar divided into two groups:
    * Integer types: Byte, Short, Int, Long
    * Floating point types: Float, Double
    *
    * Often, values returned as Int for whole numbers and Double for floating point numbers.
    * */

    // Example 1: Byte (-128 -> 127)
    val myNumerByte: Byte = 100
    println(myNumerByte)

    // Example 2: Short (-32768 -> 32767)
    val myNumShort: Short = 8888
    println(myNumShort)

    // Example 3: Int
    val myNumInt: Int = 88
    println(myNumInt)

    // Example 4: Long
    val myNumLong: Long = 15000000000L
    println(myNumLong)

    //Example 5: Float
    val myNumFloat: Float = 5.75F
    println(myNumFloat)

    // Example 6: Double
    val myNumDouble: Double = 19.99
    println(myNumDouble)

    /*
    * To prefect for Float and Double: The precision of Float is only six or seventh decimal digits.
    * While Double have about 15 digits.
    * => Prefect: Double for mos calculations.
    *
    * NOTE: Should end the value of a Float type with an "F"
    * */
}

fun kotlinScientificNumbers() {
    // A floating point number can also be a scientific number with an "e" or "E" to indicate the power of 10:
    val myNum1: Float = 35E3F
    val myNum2: Double = 12E4
    println(myNum1)
    println(myNum2)
}

fun kotlinForBooleanTypes() {
    // Booleans only take the values: [true] or [false]
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false
}

fun kotlinForCharacters() {
    // The Char data type is used to store a single character. A char value must be surrounded by single quotes, like 'A' or 'c':
    // Kotlin can't use ASCII values to display for characters.
    val myGrade: Char = 'B'
    println(myGrade)
}

fun kotlinForStringType() {
   /*
   * The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
   * */
    val myText: String = "Hello World"
    println(myText)
}

fun kotlinTypeConversion() {
    /*
    * To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():
    * */
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}