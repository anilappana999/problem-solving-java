package problemsolving;

import java.util.Stack;

public class HackerRankInAString {
	static String hackerrankInString(String s) {

		Stack<Character> stack = new Stack<>();
		stack.push('k');
		stack.push('n');
		stack.push('a');
		stack.push('r');
		stack.push('r');
		stack.push('e');
		stack.push('k');
		stack.push('c');
		stack.push('a');
		stack.push('h');
		String result="NO";

		for(Character c : s.toCharArray() ){
		    if(c==stack.peek()){
		        stack.pop();
		        if(stack.isEmpty()){
		            result = "YES";
		            break;
		        }
		    }
		}
		return result;
	}
}
