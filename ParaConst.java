
import java.util.Scanner;

public class ParaConst {

    public int ParaConst(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to print the sum by using parameterized constructor");

        int a = sc.nextInt();
        int b = sc.nextInt();

        ParaConst sam = new ParaConst();
        sam.ParaConst(a, b);
    }    
    
}
