//Take a matrix as input from the user.Search for a given number X and print the indices at which it occurs.
import java.util.*;
public class Function1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];

        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //cols
            for (int j = 0; j < cols; j++) {
               numbers[i][j]=sc.nextInt();
            }
        }
        int X = sc.nextInt();
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                //Compare with X
                if (numbers[i][j] == X) {
                    System.out.println("X found at location (" + i + "," + j + ")");
                }
            }

        }
    }
}
