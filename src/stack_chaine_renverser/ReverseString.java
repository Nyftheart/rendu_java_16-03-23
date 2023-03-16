package stack_chaine_renverser;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entrée : ");
        String inputString = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        String reversedString = "";
        while(!stack.isEmpty()) {
            reversedString += stack.pop();
        }

        System.out.println("sortie: " + reversedString);
    }
}