// when type of object is determined at runtime then it is called as dynamic binding
class Animal{  
    void eat(){System.out.println("animal is eating...");}  
   }  
     
   class Dog extends Animal{  
    void eat(){System.out.println("dog is eating...");}   
   }  

public class dynamicbinding {
    public static void main(String[] args) {
        Animal a=new Dog();  
        a.eat();                    // here dog's eat function is called at the time of compilation
                                    // dog a = new dog() --> then it is static binding
    }
}
