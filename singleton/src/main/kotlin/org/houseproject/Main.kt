package org.houseproject

fun main() {
    val eagerSingleton = EagerSingleton.getInstance()

    val lazySingleton = LazySingleton.getInstance()
}
