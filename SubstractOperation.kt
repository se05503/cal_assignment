package com.example.calculatorassignment

import com.example.calculator_assignment.AbstractOperation

//import com.example.calculator_assignment.Operation
//class SubstractOperation(override var num1: Int, override var num2: Int): Operation() {
//    override fun operate():Int {
//        return num1-num2
//    }
//}

class SubstractOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1-num2).toDouble()
    }
}