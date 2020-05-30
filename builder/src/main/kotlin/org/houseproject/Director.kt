package org.houseproject

class Director {

    fun constructHouse(builder: Builder): Builder {
        return builder.setFirePlace()
            .setGarage()
            .setPool()
    }
}
