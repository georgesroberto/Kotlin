// fun name () {
//     //code
// }



// main() is the entry point

fun main() {
    greet()
    greetUser()
    println(greetParam("Georges", 10))
}


fun greet() {
    println("Hello World")
}

fun greetUser(name : String= "Georges") {
    println("Hello $name")
}

fun greetParam(name: String, age: Int): String {
    return "Greetings $name \n I know you are $age years old"
}