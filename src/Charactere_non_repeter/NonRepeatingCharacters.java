package Charactere_non_repeter;

import java.util.*;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaîne de caractères : ");
        String inputString = sc.nextLine();
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            int count = charCountMap.get(c);
            if (count == 1) {
                System.out.print(c + " ");
            }
        }
        System.out.print("\n");
    }
}
