package com.example.calculatorassignment

class AddOperation: Calculator() {

    override fun cal() {
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

}