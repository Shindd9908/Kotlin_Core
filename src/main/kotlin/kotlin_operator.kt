import exp_class.Car

fun main() {
//    kotlinOperators()
//    assignmentOperators()
//    checkNumber(3)
//    checkingWhile(1)
    //checkingDoWhile(1)
    //checkingRanges()
    checkingOOP()
}

fun kotlinOperators() {
    val x = 17
    val y = 8
    val sum = x + y
    println(sum)
}

fun assignmentOperators() {
    var x = 10
    x += 5
    println(x)
}

fun checkNumber(number: Int) {
    if (number % 2 == 0) {
        println("$number has % 2")
    } else {
        println("$number hasn't % 2")
    }
}

fun checkingWhile(number: Int) {
    var checkingNumber = number
    while (checkingNumber < 10) {
        println(checkingNumber)
        checkingNumber++
    }
}

fun checkingDoWhile(number: Int) {
    var checkingNumber = number
    do {
        println(checkingNumber)
        checkingNumber++
    } while (checkingNumber > 10)
}

fun checkingRanges() {
    for (nums in 5..15) {
        println(nums)
    }
}

fun checkingOOP() {
    val c1 = Car()

    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)   // Outputs Ford
    println(c1.model)   // Outputs Mustang
    println(c1.year)
}