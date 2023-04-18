fun main() {
    /*
    * study for Kotlin Variables
    * */
    /// this is syntax for variables

    /*
    * The difference between var and val is that variables declared with the var keyword can be changed/modified, while val variables cannot.
    * Sự khác nhau giữa  [var] và [val] ở đây là: các biến được khai báo bằng [var] thì có thể thay đổi được, còn [val] thì không.
    * */
    var nameUser = "Khang"
    val userBirthday = 1999

    println(nameUser)
    println(userBirthday)
    println("user name is: $nameUser, user birthday is: $userBirthday")

    println("----------------------------------------------------------------")

    variablesMain()
    declareVariable()
    noteOnVal()
    displayVariables()
}

fun variablesMain() {
    /*
* Đối với Kotlin, các biến cần phải được khai báo vơi một loại cụ thể: "String" cho text và "Int" cho số
* Kotlin đủ thông minh để hiểu rằng các biến đang được khai báo là gì mà không cần phải khái báo rõ.
* However, it is possible to specify the type if you insist:
* */

    var name: String = "Khang"
    var birthYear: Int = 1999

    print(name)
    print(birthYear)
    println(name + birthYear)
}

fun declareVariable() {
    /*
    * You can also declare a variable without assigning the value, and assign the value later. However, this is only possible when you specify the type:
    * */

    // Good declareVariable
    var userName: String // so perfect code: val userName: String = "Day la bien duoc khai bao su dung sau"
    userName = "Day la bien duoc khai bao sau"
    println(userName)

    // Bad declareVariable
//    var userNameBadVaiable
//    userNameBadVaiable = "Khang"
//    println(userNameBadVaiable)
}

fun noteOnVal() {
    /*
    * value using [val]: the value can't be changed/reassigned.
    * This is example:
    * val name = "Khang"
    * name = "Khang cuc ky dep trai" // Error: (Val can't be reassigned)
    *
    * So when to use [val]
    * The [val] keyword is userfuk when you want a variable to always store the same value.
    * Ex: PI (3.14159)
    * */

    val pi = 3.14159
    println(pi)

}

fun displayVariables() {
    /*
    * We have [print] and [println] to show variables.
    * Also we have general rule for show variables.
    * */

    /*
    * We have RULES for Variables Names:
    * Names can contain letters, digits, underscores, and dollar signs
    * Names should start with a letter
    * Names can also begin with $ and _
    * Names are case-sensitive ("myVar" and "myvar" are different variables)
    * Names should start with a lowercase letter, and it cannot contain whitespace
    * Reserved words (like Kotlin keywords, such as var or String) cannot be used as names
    *
    * To prefect, we're using camelCase variables for name variables
    * */

    // Example 1:
    val name = "Khang"
    println("Hello $name")

    // Example 2:
    val firstName = "Luong Duc"
    val lastName = "Khang"
    val fullName = firstName + lastName
    println(fullName)

    // Example 3:
    val x = 17
    val y = 8
    println(x + y)
}