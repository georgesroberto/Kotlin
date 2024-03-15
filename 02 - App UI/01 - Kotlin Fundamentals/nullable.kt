fun main() {
    // NULL (?)
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
    //Prints length


    var favActor: String? = null
    println(favActor?.length)
    //Prints null

    var favAct: String? = "Sandra Oh"
    println(favAct!!.length)
    //prints length

    // NOT NULL (!!)
    var favoriteAct: String? = null
    println(favoriteAct!!.length)
    //prints error

}

fun nullCheckWithoutIf(){
    
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}