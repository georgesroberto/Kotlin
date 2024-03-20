// GENERICS class

class GQuestion<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)


// ENUM class

enum class Difficulty{
    EASY, MEDIUM, HARD
}

class EQuestion<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


// DATA class

data class DQuestion <T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


fun main() {
    // GENERIC class
    val questionGeneric = GQuestion<String>("What is my name....", "Georges", "Easy")
    println(questionGeneric.toString())

    // ENUM class
    val questionEnum = EQuestion<Int>("What is my age..", 10, Difficulty.MEDIUM)
    println(questionEnum.toString())

    // DATA (enum)
    val questionData = DQuestion<Int>("What is my age..", 10, Difficulty.MEDIUM)
    println(questionData)

}