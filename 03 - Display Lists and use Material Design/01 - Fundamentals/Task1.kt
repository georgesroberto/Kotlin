enum class DayPart {
    Morning, Afternoon, Evening
} 

data class Event(
    val title: String, 
    val description: String? = null, 
    val dayPart: DayPart, 
    val durationMinutes:Int
)

fun main(){
    val event = Event("Study Kotlin","Commit to studying Kotlin at least 15 minutes per day.", DayPart.Evening, 15)
    println("${event}")
}