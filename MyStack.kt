package com.example.calculator_assignment

import java.util.Stack

class MyStack {
    fun getPostFixExpressionOperation(expression: String): Int {
        val stack = Stack<String>()
        val tokenizedArray = toTokenizedArray(expression)
        var postFixExpression = ""
        for (e in tokenizedArray) {
            if (e == "*" || e == "/" || e == "+" || e == "-") {
                if (stack != null && stack.peek() != "(") {
                    postFixExpression += stack.pop() + " "
                    stack.push(e)
                } else stack.push(e)
            } else if (e == "(") {
                stack.push(e)
            } else if (e == ")") {
                postFixExpression += stack.pop() + " "
                stack.pop()
            } else {
                postFixExpression += "$e "
            }
        }
        if (stack != null) {
            postFixExpression += stack.pop()
        }
        return getIntValue(postFixExpression)
    }

    fun toTokenizedArray(str: String): Array<String> {
        var strCopy = str.replace("(", "( ")
        strCopy = strCopy.replace(")", " )")
        return strCopy.split(" ").toTypedArray()
    }

    fun getIntValue(postFixExpression: String): Int {
        var arrayStr = postFixExpression.split(" ")
        var stack = Stack<String>()
        var result = 0
        for (e in arrayStr) {
            if (e == "+") {
                val n1 = stack.pop().toInt()
                val n2 = stack.pop().toInt()
                result = n1 + n2
                stack.push((n1 + n2).toString())
            } else if (e == "-") {
                val n1 = stack.pop().toInt()
                val n2 = stack.pop().toInt()
                result = n1 - n2
                stack.push((n1 - n2).toString())
            } else if (e == "*") {
                val n1 = stack.pop().toInt()
                val n2 = stack.pop().toInt()
                result = n1 * n2
                stack.push((n1 * n2).toString())
            } else if (e == "/") {
                val n1 = stack.pop().toInt()
                val n2 = stack.pop().toInt()
                result = n2 / n1
                stack.push((n2 / n1).toString())
            } else {
                stack.push(e)
            }
        }
        return result
    }
}