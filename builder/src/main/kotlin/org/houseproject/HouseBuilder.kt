package org.houseproject

class HouseBuilder(
    private val house: House = House()
) : Builder {

    override fun setPool(): HouseBuilder {
        println("building house for Pool...")
        house.pool = "withPool"
        return this
    }

    override fun setFirePlace(): HouseBuilder {
        println("building house for FirePlace...")
        house.firePlace = "withFirePlace"
        return this
    }

    override fun setGarage(): HouseBuilder {
        println("building house for Garage...")
        house.garage = "withGarage"
        return this
    }

    fun getResult(): House = house
}
