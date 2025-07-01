
//Exception Handling



class Exce{
    void div(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println(c);
            int arr[] = new int[6];
            arr[10]= 20;
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        
        }
    }
class Excecpt
{
    public static void main(String[] args) {
        Exce e = new Exce();
        e.div();
    }
}