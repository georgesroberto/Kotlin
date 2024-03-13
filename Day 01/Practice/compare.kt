/*


10. Compare two numbers
Modern mobile phones have a built-in feature that tracks screen time, or the time you spend on your phone each day.

In this exercise, you implement a function that compares the time in minutes that you spent on your phone today versus the time spent yesterday. The function accepts two integer parameters and returns a boolean value.

The first parameter holds the number of minutes that you spent today and the second parameter holds the number of minutes that you spent yesterday. The function returns a true value if you spent more time on the phone today compared to yesterday. Otherwise, it returns a false value.

For example, if you called the function with these named arguments:

timeSpentToday = 300 and timeSpentYesterday = 250, the function returns a true value.
timeSpentToday = 300 and timeSpentYesterday = 300, the function returns a false value.
timeSpentToday = 200 and timeSpentYesterday = 220, the function returns a false value.
Hint: The > comparison operator returns a true value if the value before the operator is greater than the value after it. Otherwise, it returns a false value.


*/


fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}