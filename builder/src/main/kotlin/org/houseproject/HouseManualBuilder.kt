package org.houseproject

class HouseManualBuilder(
    private val houseManual: HouseManual = HouseManual()
) : Builder {

    override fun setPool(): Builder {
        println("building house manual for Pool...")
        houseManual.poolManual = "withPoolManual"
        return this
    }

    override fun setFirePlace(): Builder {
        println("building house manual for FirePlace...")
        houseManual.firePlaceManual = "withFirePlaceManual"
        return this
    }

    override fun setGarage(): Builder {
        println("building house manual for Garage...")
        houseManual.garageManual = "withGarageManual"
        return this
    }

    fun getResult(): HouseManual = houseManual
}
