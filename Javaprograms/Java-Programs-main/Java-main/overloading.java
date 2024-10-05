class addition{
    int adder(int x,int y){
        return x+y;

    }

    int adder(int x,int y,int z){           //  1. by changing the no of arguments
        return x+y+z;

    }

    double adder(double a,double b){        // 2. by changing the datatype 
        return a+b;
    }

}


public class overloading {
    
    public static void main(String[] args) {
     
        addition a = new addition();
        System.out.println(a.adder(5, 4));
        System.out.println(a.adder(6,7,8));
    }
    
}
