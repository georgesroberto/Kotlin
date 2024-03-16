
fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (!isTrick) {
        return trick
    } else {
        println(extraTreat(4))
        return treat
    }
}

val trick: () -> Unit = {
    println("Tricked")
}

val treat: () -> Unit = {
    println("Treat")
}

fun main() {
    val coins: (Int) -> String = { quantity -> 
        "$quantity quarters"
    }
    
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }
    
    val treatFunction = trickOrTreat(true, cupcake)
    val trickFunction = trickOrTreat(false, coins)
    treatFunction()
    trickFunction()
}