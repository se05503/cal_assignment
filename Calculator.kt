package com.example.calculatorassignment

import com.example.calculator_assignment.AbstractOperation

class Calculator(private val operation: AbstractOperation) {
    fun calculate(num1:Int, num2:Int):Double {
        return operation.operate(num1,num2)
    }
}



//class Calculator {
//    fun cal(operation: Operation) {
//        when(operation) {
//            is AddOperation -> {
//                val result = operation.operate()
//                println("계산 결과 : ${result}")
//            }
//            is SubstractOperation -> {
//                val result = operation.operate()
//                println("계산 결과 : ${result}")
//            }
//            is MultiplyOperation -> {
//                val result = operation.operate()
//                println("계산 결과 : ${result}")
//            }
//            is DivideOperation -> {
//                val result = operation.operate()
//                println("계산 결과 : ${result}")
//            }
//        }
//    }
//}