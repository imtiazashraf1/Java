//WAP which finds if a string is a palindromes string or not.(A palindromes string is read the same strting from the start or the end)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

         String reversed="";
         //Reverse the string
        for (int i = str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }

//check palindrome

        if (str.equals(reversed)){
            System.out.println("The string is equal to the string.So, the string is Palindrome.");
        }
        else{
            System.out.println("The string is not equal to the string.So, the string is Not Palindrome.");
        }
    }
}
