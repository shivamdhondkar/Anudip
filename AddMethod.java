import java.util.Scanner;

public class AddMethod {
    int add(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        AddMethod m = new AddMethod();
        int sum = m.add(a,b);
        System.out.println("Sum = "+sum);
    }
}
