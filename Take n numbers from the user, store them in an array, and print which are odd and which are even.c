//Take n numbers from the user, store them in an array, and print how many numbers are odd and how many are even


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenCount =0, oddCount = 0;

        System.out.print("Enter how many numbers you want: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];//Creat array of size n


        // Take n numbers as input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        //The condition of even or odd number.
        for (int i = 0; i < n; i++) {
            if(numbers[i]%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("Total Even numbers:"+evenCount);
        System.out.println("Total Odd numbers:"+oddCount);
    }
}
