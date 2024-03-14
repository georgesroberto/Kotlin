# Practice Quiz to understand LKotlin

In this section, you'll practice coding with Kotlin by implementing a pedometer and comparing two strings.

**Pedometer Example:**

```kotlin
fun calculateSteps(distance: Double): Int {
    // Calculate steps based on distance
    return (distance / 0.7).toInt()
}

fun main() {
    val distance = 5.0 // Distance walked in kilometers
    val steps = calculateSteps(distance)
    println("You walked $steps steps.")
}
```

**Comparing Two Strings Example:**

```kotlin
fun compareStrings(str1: String, str2: String): Boolean {
    return str1 == str2
}

fun main() {
    val string1 = "Hello"
    val string2 = "World"
    val result = compareStrings(string1, string2)
    println("Are the strings equal? $result")
}
```
