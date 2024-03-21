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


// SINGLETON class
// object StudentProgress{
//     var total: Int = 10
//     var answered: Int = 5
// }

class Quiz{
    var question = EQuestion<Int>("What is my age?", 10, Difficulty.HARD)

    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 5
    }
}



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

    // SINGLETON class

    // println("Scored ${StudentProgress.answered} of ${StudentProgress.total}.")    
    
    println("Scored ${Quiz.answered} of ${Quiz.total}.")
}