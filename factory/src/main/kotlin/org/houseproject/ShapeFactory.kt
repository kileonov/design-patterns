package org.houseproject

import javax.naming.OperationNotSupportedException

class ShapeFactory {

    fun createShape(type: ShapeEnum) = when (type) {
        ShapeEnum.CIRCLE -> Circle()
        ShapeEnum.SQUARE -> Square()
        ShapeEnum.TRIANGLE -> Triangle()
        else -> throw OperationNotSupportedException("Cannot create shape of type = $type")
    }
}
