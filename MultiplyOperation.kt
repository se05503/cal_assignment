package com.example.calculatorassignment

import com.example.calculator_assignment.AbstractOperation

class MultiplyOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1*num2).toDouble()
    }
}

//import com.example.calculator_assignment.Operation
//
//class MultiplyOperation(override var num1: Int, override var num2: Int) : Operation(), EventCalculator {
//
//    override fun operate():Int {
//        return num1*num2
//    }
//
//    //인터페이스 추가
//    override fun eventCal() {
////        TODO("Not yet implemented")
//        println("★★★★★★★★★★★★★★★")
//        println("★★★★★★★★★★★★★★★")
//        println("★★★★★곱하기★★★★★★★")
//        println("★★★★★★★★★★★★★★★")
//        println("★★★★★★★★★★★★★★★")
//    }
//}