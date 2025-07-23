//Take a matrix as input from the user.Search for a given numbers x and print the indices(i,j) at which it occurs.
import java.util.*;
public class Input2DArrays2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < cols; j++) {
            }
        }
        int x = sc.nextInt();
        //outer loop
        for (int i = 0; i < rows;i++){
            //inner loop
            for (int j = 0; j < cols; j++){
                //compare with X
                if(numbers[i][j] == x){
                    System.out.println("x is found at location("+ i +", "+ j +")");
                }
            }
        }

    }
}
