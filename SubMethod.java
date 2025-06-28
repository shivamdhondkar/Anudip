
import java.util.Scanner;

public class SubMethod {
    int Sub(int a, int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers : ");

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        SubMethod m = new SubMethod();
        int substraction = m.Sub(a, b);
        System.out.println("Subtraction = "+substraction);

    }

}