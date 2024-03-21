# Generic, Objects, Extensions

## Generics

- Help us to inherit property of a class but allowing for an unspecified data type

## Enums

- To group data that has limited value and does not change
- Examples include
  - 4 Cardinal points (North, East, South, West)
  - 3 Difficulty level (Easy, Medium, Hard)

## Data Class

- Helps to define classes that do not need any complex functionality but instead only manipulates data
- Comes with predefined methods like
  - toString
  - hashCode
  - equals
  - copy

## Singleton Class

- They help us to define objects that requie a single instance.
- Examples
  - Player stats in a game
  - Authentication object

## Extendable property

- They don't store data hence only use get()
- Example

  ```kt
    val Quiz.StudentProgress.progressText: String
      get() = "Scored ${answer} of ${total}"
  ```

## Extensible function

- Same Syntax as property
- Example

  ```kt
    fun Quiz.StudentProgress.printProgressBar(){
      repeat(Quiz.answered){ print("▓") }
      repeat(Quiz.total - Quiz.answered){ print("▒") }
      println()
      println(Quiz.progressText)
  }
  ```

## Interface

- Instead of using Extendable property and methods, all that can be done in an interfce
- We simply frfinr (in thr interface) the property and method
- Then we override them in the extended class.

## let() and it

- Hwelps us to reduce repetition of recurring object
- Example

  ```kt
    fun printQuiz(){
      println(question.questionText)
      println(question.answer)
      println(question.difficulty)
    }
  ```

  **Replace with**

  ```kt
    fun printQuiz(){
      question.let(){
        println(it.questionText)
        println(it.answer)
        println(it.difficulty)
      }
    }
  ```

---

## Arrays

- Stores a collection of values with similar characteristics
- Doesn't allow addition of nw elements
- Cannot be resized
- use `arraOf(elements)`

## Lists

- Allows for resizing
- Stores data as arrays
- Has property like
  - get(index)
  - indexOf(element)
  - size()
  - add(element)
  - removeAt(index)
  - remove(element)
  - contains(element)
- Iteration

  ```kt
    for(el in list){
      println(el)
    }

    println("Future Moon" in solarSystem) //outputs false
  ```

### List and Mutable List

- They are interfeaces and can be extended
- List is immutable (Read - Only)
- Mutable List ( Can be modified)
