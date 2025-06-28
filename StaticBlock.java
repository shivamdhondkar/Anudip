public class StaticBlock {

    static void PrintNum()
    {
        System.out.println("This is the Ststic block");
    }
    public static void main(String[] args) {
        System.out.println("This is main block of the class");
        StaticBlock a = new StaticBlock();
        a.PrintNum();
    }
    
}
