enum class Daypart {
    MORNING, AFTERNOON, EVENING
} 

data class NEvent(
    val title: String, 
    val description: String? = null, 
    val daypart: Daypart, 
    val durationInMinutes:Int
)

fun main(){
    val event1 = NEvent(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    val event2 = NEvent(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
    val event3 = NEvent(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
    val event4 = NEvent(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
    val event5 = NEvent(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
    val event6 = NEvent(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

	val event = mutableListOf<NEvent>(event1, event2, event3, event4, event5, event6)

    val groupedEvents = event.groupBy{it.daypart}
    
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
}