
/*
 Implement an algorithm to determine if a string has all unique characters. The program should only check if alphabetic characters are unique. Spaces, quotations, numbers, etc should be ignored. The case of each character matters. 'A' is not the same as 'a'.

 Input Format

The input is one line containing any number of characters.

Output Format

The output should be either "Yes" or "No" with no spaces.
*/

import java.util.Scanner;

class UniqueCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];
        
        for (Character ch: input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    if (upperCase[ch - 'A'] == 1) {
                        System.out.println("No"); 
                        return;
                    } else {
                        upperCase[ch - 'A'] = 1;
                    }
                } else if (Character.isLowerCase(ch)) {
                    if (lowerCase[ch - 'a'] == 1) {
                        System.out.println("No"); 
                        return;
                    } else {
                        lowerCase[ch - 'a'] = 1;
                    }
                }
                
            }
        }
        
     System.out.println("Yes");
      
    }
}
