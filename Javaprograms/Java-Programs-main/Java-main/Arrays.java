public class Arrays {
    public static void main(String[] args) {
        int marks[]= new int[6]; 
        int newmark[][]= new int[2][2];           // arrays can be initialized only at begining not at middle
        marks[0]=95;
        System.out.println(marks[1]);       // if no value if there in index  it returns 0
        System.out.println(marks[0]);


        // 2d
        newmark[0][1]=20;
        System.out.println(newmark[0][1]);


    }
}
