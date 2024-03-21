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
}