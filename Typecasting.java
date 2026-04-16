import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a floating point number X: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextFloat();

        //Type casting
        int intValue = (int) x;
        byte byteValue = (byte) x;

        System.out.println("Double value: " + x);
        System.out.println("Integer value: " + intValue);
        System.out.println("Byte value: " + byteValue);

        input.close();
    }
}
