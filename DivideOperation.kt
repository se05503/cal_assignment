package com.example.calculatorassignment

import com.example.calculator_assignment.AbstractOperation

class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        require(num2!=0) {ArithmeticException("0으로 나누면 안됩니다!")}
        return num1.toDouble()/num2
    }
}
//import com.example.calculator_assignment.Operation
//
//class DivideOperation(override var num1: Int, override var num2: Int): Operation(), EventCalculator {
//    override fun operate():Int {
//        return num1/num2
//    }
//
//    // 인터페이스 추가
//    override fun eventCal() {
////        TODO("Not yet implemented")
//        println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆")
//        println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆")
//        println("☆☆☆☆☆☆☆나눗셈☆☆☆☆☆☆☆☆")
//        println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆")
//        println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆")
//    }
//}