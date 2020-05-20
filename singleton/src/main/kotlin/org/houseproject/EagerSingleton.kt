package org.houseproject

class EagerSingleton private constructor() {

    companion object {
        private val INSTANCE: EagerSingleton = EagerSingleton()

        fun getInstance() = INSTANCE
    }
}
