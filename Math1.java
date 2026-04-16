import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a double value X: ");
        double X = sc.nextDouble();
        System.out.println("Enter a double value Y: ");
        double Y = sc.nextDouble();

        double sum;
        sum=X+Y;
        System.out.println("The sum is : "+ sum);

        double div=X/5;
        System.out.println("The division is : "+ div);

        double multi=X*5;
        System.out.println("The multiplication is : "+ multi);

        System.out.println(X+" "+Y);

    }
}
