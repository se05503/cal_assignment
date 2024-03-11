package com.example.calculatorassignment
import com.example.calculator_assignment.AbstractOperation

//class AddOperation(override var num1:Int, override var num2:Int): Operation() {
//    override fun operate():Int {
//        return num1+num2
//    }
//}

class AddOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1+num2).toDouble()
    }
}