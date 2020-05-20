package org.houseproject

fun main() {
    val factory = ShapeFactory()

    val circle = factory.createShape(ShapeEnum.CIRCLE)
    val square = factory.createShape(ShapeEnum.SQUARE)
    val triangle = factory.createShape(ShapeEnum.TRIANGLE)

    circle.draw()
    square.draw()
    triangle.draw()
}
