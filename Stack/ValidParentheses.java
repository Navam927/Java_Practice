package Stack;
import java.util.*;

public class ValidParentheses{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                char top = st.peek();
                st.pop();
                if( (top == '(' && s.charAt(i) == ')') ||
                    (top == '{' && s.charAt(i) == '}') ||
                    (top == '[' && s.charAt(i) == ']')) {

                        continue;
                }
                else{
                    System.out.println("Invalid Parenthesis");
                }
                
                
            }
        }
        if(!st.empty()){
            System.out.println("Invalid Parenthesis");
        }
        else{
            System.out.println("valid parenthesis");
        }

    }
}