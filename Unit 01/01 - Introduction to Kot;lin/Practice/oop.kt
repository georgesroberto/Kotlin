fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()



    // SOLUTION
    cityWeather("Ankara", 27, 31, 82)
    cityWeather("Tokyo", 32, 36, 10)
    cityWeather("Cape Town", 59, 64, 2)
    cityWeather("Guatemala City", 50, 55, 7)
}

// There are many similarities in the code that prints the weather for each city. For example, there are phrases that are repeated multiple times, such as "City:" and "Low temperature:". Similar, repeated code creates the risk of errors in your program. For one of the cities, you may have a typo or you may forget one of the weather details.

// Can you create a function that prints the weather details for a single city to reduce the repetition in the main() function and then do the same for the remaining cities?
// Can you update the main() function to call the function that you created for each city and pass in the appropriate weather details as arguments?


fun cityWeather(city : String, lowTemperature : Int, highTemperature : Int,  chanceOfRain : Int ){

    println("City: $city")
    println("Low temperature: $lowTemperature, High temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}