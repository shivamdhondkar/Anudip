
import java.util.Scanner;

public class MulMethod {
    int mul(int a, int b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers : ");

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MulMethod m = new MulMethod();
        int multiplication = m.mul(a, b);
        System.out.println("Multiplication = "+multiplication);

    }

}
