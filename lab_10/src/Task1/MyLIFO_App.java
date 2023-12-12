package Task1;

import java.util.Arrays;
import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
		int start = 0;
		int end = array.length-1;

		while (start < end) {
			E temp =  array[start];
			array[start] =  array[end];
			array[end] = temp;

			start++;
			end--;
		}
	}

	// This method checks the correctness of the given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==> false
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();
		for (char ch : input.toCharArray()) {
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if(ch == ')' && !stack.isEmpty()	&& stack.peek()	== '('  ) {
				stack.pop()	;
			} else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}	else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if(ch == ')' || ch == ']' || ch == '}') {
				return false;
			}
		}
		return stack.isEmpty();
	}

	// This method evaluates the value of an expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
	// TODO
		Stack<Integer> operandStack = new Stack<>();
		Stack<Character> operatorStack = new Stack<>();

	return 0;
	}

	public static void main(String[] args) {

		Integer[] arr1 = {1,2,3,4,5};

		reserve(arr1);
		System.out.println(Arrays.toString(arr1));

		  String input = "()(())[]{(())}";
	        System.out.println("Is input correct? " + isCorrect(input));
	}

}
