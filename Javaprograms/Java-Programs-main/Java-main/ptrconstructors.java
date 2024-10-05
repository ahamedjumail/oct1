class A{
    void m(){
        System.out.println("M");

    }
    void n(){
        System.out.println("N");
        this.m();                       // to call the method of a class
    }
}


class meter{
    static{
        System.out.println("Static block executed before meter class"+"\n"+"----------------");
    }
    meter(){
        this(5);
        System.out.println("Non parameterised constructor");
    }

    meter(int x){
        System.out.println("parametertised constructor");
    }
}


public class ptrconstructors {
    public static void main(String[] args) {
        A a=new A();
        a.n();

        System.out.println("-------------------");
        // meter class

        meter m = new meter();      // calling param from non param vice versa can also be done
        // m()
    }
}

