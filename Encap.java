
//Encapulation

class Sample {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String nm){
        this.name = nm;
    }

}
public class Encap{

    public static void main(String[] args) {
    
        Sample en = new Sample();
        en.setName("lksksd");
        String s = en.getName();
        System.out.println(s);

        
    }
}