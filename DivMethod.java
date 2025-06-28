
import java.util.Scanner;

public class DivMethod {
    int div(int a, int b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers : ");

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        DivMethod m = new DivMethod();
        int division = m.div(a, b);
        System.out.println("Division = "+division);

    }

}