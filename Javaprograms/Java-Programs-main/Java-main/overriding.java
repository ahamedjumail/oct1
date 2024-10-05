// when child and parent class has same name and paramters then it is called as method overrdiding

class vehicle{
    void run(){
        System.out.println("vehicle is running");
    }
}

class bike extends vehicle{
    void run(){                                     // if this run fun is commented then vehicle's run function will be executed
        System.out.println("bike is running");
    }   
}

public class overriding {
    public static void main(String[] args) {
        bike b= new bike();
        b.run();
    }
    
}
