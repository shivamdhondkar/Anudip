//100 % apstraction using interface

interface Animal{
    void walk();
    void eat();
}

interface cat{
    void run();
}

class Dog implements Animal,cat{
    public void walk(){
        System.out.println("Animal can Walk");
    }

    public void eat(){
        System.out.println("Animal can eat");
    }
    
    public void run(){
        System.out.println("Cat can run");

    }
}

class FullAbs{
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.walk();
        dg.eat();
        dg.run();
    }
}