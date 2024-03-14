import com.example.calculator_assignment.MyStack
import java.util.Stack

fun main() {
    print("원하는 연산을 입력해주세요 : ")
    var inputStr = readLine()!!
    var outputstr = MyStack.getPostFixExpressionOperation(inputStr)
    var result = MyStack.getAnswer(outputstr)
    print("연산 결과 : ${result}")
}
//d
