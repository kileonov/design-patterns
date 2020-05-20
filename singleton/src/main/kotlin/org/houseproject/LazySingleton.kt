package org.houseproject

class LazySingleton private constructor() {

    companion object {
        @Volatile
        private var INSTANCE: LazySingleton? = null

        fun getInstance(): LazySingleton? {
            if (INSTANCE == null) {
                synchronized(LazySingleton::class.java) {
                    if (INSTANCE == null) {
                        INSTANCE = LazySingleton()
                    }
                }
            }
            return INSTANCE
        }
    }
}
