// ARRAY in kt


val solarSystem = arrayOf("Earth", "Venus", "Uranus")
val gasPlanets = arrayOf<String>("Neptune", "Jupiter")


// LISTS in kt

val solarList = mutableListOf("Mercury", "Venus", "Earth", "Mars")

fun main(){
    solarList.add("Jupiter")
    solarList.remove("Mars")
    println(solarList.size)
    solarList.contains("Earth")
    solarList.indexOf("Earth")
    
    for (planet in solarList){
        println(planet)
    }

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )
}