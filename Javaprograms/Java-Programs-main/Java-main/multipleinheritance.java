// it can be achieved using interface


interface showing {
    void print();
    
}
interface printing {
    void print();

    
}

class mh implements showing,printing{
    public void print(){
        System.out.println("it is print");
    }

}
public class multipleinheritance {
        public static void main(String[] args) {
            mh m=new mh();
            m.print();
        }
}
