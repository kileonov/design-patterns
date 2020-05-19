package org.houseproject

fun main() {

    val configType = ButtonFactory.WINDOWS_BUTTON

    val button = ButtonFactory().createButton(configType)
    button.render()
    button.onClick()

    listOf("1", "2", "3").map { it }.joinToString(separator = " ")
}
