package Leetcode;

import java.util.Stack;

public class BackspaceStringCompare_844_UsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(backspaceCompare("d", "dddd###"));
	}
	
	public static boolean backspaceCompare(String S, String T) {

		Stack<Character> sString = new Stack<Character>();
		Stack<Character> tString = new Stack<Character>();

		for (char c : S.toCharArray()) {

			if (c != '#') {
				sString.push(c);
				continue;
			}

			if (c == '#' && !sString.empty()) {
				sString.pop();
			}

		}

		for (char c : T.toCharArray()) {

			if (c != '#') {
				tString.push(c);
				continue;
			}

			if (c == '#' && !tString.empty()) {
				tString.pop();
			}

		}

		if (tString.equals(sString)) {
			return true;
		}

		return false;
	}
}
