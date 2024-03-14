package com.example.calculator_assignment

import java.util.Stack

class MyStack {
    companion object {
        fun getPostFixExpressionOperation(inputStr: String): String {
            var strArr = strToArr(inputStr)
            val stack = Stack<String>()
            var answer: String = ""
            for (e in strArr) {
                when (e) {
                    "+", "-", "*", "/" -> {
                        while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(e)) {
                            answer += stack.pop() + " "
                        }
                        stack.push(e)
                    }

                    "(" -> {
                        stack.push(e)
                    }

                    ")" -> {
                        while (stack.peek() != "(") {
                            answer += stack.pop() + " "
                        }
                        stack.pop()
                    }

                    else -> {
                        answer += "$e "
                    }
                }
            }

            while (!stack.isEmpty()) {
                answer += stack.pop() + " "
            }

            return answer
        }

        fun getAnswer(str: String): Int {
            // str : 컴퓨터가 이해할 수 있는 후위 연산 (2+4)*6/3 → 2 4 - 6 * 3 /
            val strArr = str.split(" ").toTypedArray() // 일단 배열에 익숙해져보자
            val stack = Stack<String>()
            var answer = 0
            for (e in strArr) {
                when (e) {
                    "+" -> {
                        val num1 = stack.pop().toInt()
                        val num2 = stack.pop().toInt()
                        answer = num1 + num2
                        stack.push(answer.toString())
                    }

                    "-" -> {
                        val num1 = stack.pop().toInt() //4
                        val num2 = stack.pop().toInt() //2
                        answer = -(num1 - num2)
                        stack.push(answer.toString())
                    }

                    "*" -> {
                        val num1 = stack.pop().toInt()
                        val num2 = stack.pop().toInt()
                        answer = num1 * num2
                        stack.push(answer.toString())
                    }

                    "/" -> { // 3 6 /
                        val num1 = stack.pop().toInt() // 6
                        val num2 = stack.pop().toInt() // 3
                        answer = num2 / num1 // 3/6
                        stack.push(answer.toString())
                    }

                    else -> {
                        stack.push(e)
                    }
                }
            }
            return answer
        }

        fun strToArr(s: String): Array<String> {
            var tempStr = s.replace("(", "( ")
            tempStr = tempStr.replace(")", " )")
            return tempStr.split(" ").toTypedArray()
        }

        fun precedence(operation: String): Int {
            return when (operation) {
                "*", "/" -> 2
                "+", "-" -> 1
                else -> 0
            }
        }
    }
}