package String_verify;

import java.util.*;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entrée : ");
        String inputString = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean verifier = true;

        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{' || ch == '<') {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}' || ch == '>') {
                if(stack.isEmpty()) {
                    verifier = false;
                    break;
                }
                char ch2 = stack.pop();
                if((ch == ')' && ch2 != '(') ||
                        (ch == ']' && ch2 != '[') ||
                        (ch == '}' && ch2 != '{') ||
                        (ch == '>' && ch2 != '<') ||
                        (ch == '{' && ch2 != '}'))
                {
                    verifier = false;
                    break;
                }
            }
        }

        if(!stack.isEmpty() || !verifier) {
            System.out.println("non vérifiée");
        }
        else {
            System.out.println("vérifiée");
        }
    }
}
