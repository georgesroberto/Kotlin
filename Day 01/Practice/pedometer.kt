

// Can you rename the functions, function parameters, and variables in this program based on best practices?


fun main() {
    val Steps = 4000
    val caloriesBurned = pedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsToCalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}