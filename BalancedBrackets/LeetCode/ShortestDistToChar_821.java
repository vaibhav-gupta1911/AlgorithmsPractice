package Miscellaneous;

import java.util.Stack;

//ALGO:
//	1) For every opening bracket: { [ ( push it to the stack.
//	2) For every closing bracket: } ] ) pop and check whether type of bracket is opposite. If not return false;
//  Also check if stack is already empty before POP, if Yes return false.
//	3) In end stack is not empty, return false, otherwise true.

public class BalancedBrackets {

	public static void main(String args[]) {

		String brackets = "({} )()";
		
		if (isBalanced(brackets))
			System.out.print("true");
		else
			System.out.print("false");
	}
	
	static boolean isBalanced(String str) {
		
		Stack<Character> strAsChars = new Stack<Character>();

		for (char chr : str.toCharArray()) {

			switch (chr) {

			case '{':
			case '[':
			case '(':
				strAsChars.push(chr);
				break;

			case ']':
				if (strAsChars.isEmpty() || strAsChars.pop() != '[')
					return false;
				break;
			case '}':
				if (strAsChars.isEmpty() || strAsChars.pop() != '{')
					return false;
				break;
			case ')':
				if (strAsChars.isEmpty() || strAsChars.pop() != '(')
					return false;
				break;

			}
		}

		if (strAsChars.isEmpty())
			return true;
		else
			return false;
	}
}
