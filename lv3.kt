package com.example.calculatorassignment

fun main() {
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        var calculator = Calculator()
        var addCalculator = AddOperation()
        var divCalculator = DivideOperation()
        var mulCalculator = MultiplyOperation()
        var subCalculator = SubstractOperation()

        when (opt) {
            1 -> addCalculator.cal()
            2 -> subCalculator.cal()
            3 -> mulCalculator.cal()
            4 -> divCalculator.cal()
            else -> println("처음부터 다시 입력하세요!")
        }
    }
    println("=======프로그램이 종료되었습니다======")
}