
//Abstraction

abstract class Animal{
    abstract void walk();{
        System.out.println("Animal can Walk");
    }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Extended class from abstract class");
    }
}

class Abst{

    public static void main(String[] args) {

        Dog dg = new Dog();
        dg.walk();
        
    }
}
