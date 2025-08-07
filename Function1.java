//Print a given name in function
import java.util.*;
public class Function1 {
    public static void printNmae(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        printNmae(name);
    }
}
