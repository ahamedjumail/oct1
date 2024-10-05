class Animal{
    void eat(){
        System.out.println("Animal eating");
    }
}

class dog extends Animal{
    void work(){System.out.println("Dog barking");}
}

class rajapalayamdog extends dog{
    void agility(){System.out.println("this dog has more agility");}
}
public class inheritence {
    public static void main(String[] args) {
        rajapalayamdog gs=new rajapalayamdog();
        gs.eat();
        gs.work();
        gs.agility();
    }
    
}
