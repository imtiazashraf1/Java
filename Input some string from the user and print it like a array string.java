/Input from the user and print it like a array string.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();//Take the input
        }
        System.out.println(Arrays.toString(str));
        //In the 2nd index user should take "Ashraf" in the code.
        str[1]="Ashraf";
        System.out.println(Arrays.toString(str));
    }
}
