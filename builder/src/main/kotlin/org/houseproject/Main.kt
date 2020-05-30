package org.houseproject

fun main() {
    val director = Director()

    val houseBuilder = HouseBuilder()
    director.constructHouse(houseBuilder)
    val house = houseBuilder.getResult()
    println(house)

    println("=================")

    val houseManualBuilder = HouseManualBuilder()
    director.constructHouse(houseManualBuilder)
    val houseManual = houseManualBuilder.getResult()
    println(houseManual)
}
