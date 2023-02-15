fun main() {
    val first = Dice(6)
    println("d${first.numSides} rolling 10x:")
    repeat(10){
        println("> ${first.roll()}")
    }
    
    val second = Dice(20)
    println("d${second.numSides} rolling 10x:")
    repeat(10){
        println("> ${second.roll()}")
    }
}