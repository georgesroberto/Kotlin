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

// EXTEND property
val Quiz.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered"
// EXTEND method
fun Quiz.StudentProgress.printProgressBar(){
    repeat(Quiz.answered){ print("▓") }
    repeat(Quiz.total - Quiz.answered){ print("▒") }
    println()
    println(Quiz.progressText)
}


// INTERFACE TO REPLACE EXTENSIBLES

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar(){}
}


// EXTEND INTERFACE
class IQuiz : ProgressPrintable {
    var question = EQuestion<Int>("What is my age?", 10, Difficulty.HARD)

    companion object StudentProgress{
        var total: Int = 10
        var answered: Int = 5
    }

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("▓") }
        repeat(Quiz.total - Quiz.answered) { print("▒") }
        println()
        println(progressText)
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

    // EXTEND property
    println(Quiz.progressText)
    // EXTEND method
    println(Quiz.printProgressBar())


    // INTERFACE INSTEAD OF EXTENSIBLE
    // DELETE EXTEND PROPERTY AND METHOD
    println(Quiz.printProgressBar())
    

}