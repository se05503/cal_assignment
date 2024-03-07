package com.example.calculatorassignment

/*
fun main() {
    // 잘 모르겠으니 지금까지 배운 내용 전부 써본다는 느낌으로 먼저 가자!
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 나머지:5 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        var calculator = Calculator(opt)

        when (calculator.opt) {
            1 -> calculator.add()
            2 -> calculator.sub()
            3 -> calculator.mul()
            4 -> calculator.div()
            5 -> calculator.res()
            else -> println("처음부터 다시 입력하세요!")
        }
    }
    println("=======프로그램이 종료되었습니다======")
}

class Calculator(opt:Int) {
    var opt: Int = 0

    init {
        this.opt=opt
    }

    fun add() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1+num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun sub() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1-num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun div() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1/num2}")
            print("나눗셈 몫 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun mul() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1*num2}")
            print("곱셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun res() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1%num2}")
            print("나눗셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }
}
*/