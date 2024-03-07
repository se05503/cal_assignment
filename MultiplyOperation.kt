package com.example.calculatorassignment

class MultiplyOperation : Calculator(), EventCalculator {

    override fun cal() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1*num2}")
            print("곱셈 연산을 계속하고 싶으시면 1 아니면 0, 이벤트를 원하시면 -1을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
            if(opt==-1) eventCal()
        }
    }

    //인터페이스 추가
    override fun eventCal() {
//        TODO("Not yet implemented")
        println("★★★★★★★★★★★★★★★")
        println("★★★★★★★★★★★★★★★")
        println("★★★★★곱하기★★★★★★★")
        println("★★★★★★★★★★★★★★★")
        println("★★★★★★★★★★★★★★★")
    }
}