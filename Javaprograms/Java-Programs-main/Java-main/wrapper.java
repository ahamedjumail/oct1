public class wrapper {
    public static void main(String[] args) {
        int a=20;
        Integer i=Integer.valueOf(a);
        System.out.println("a :"+ a +"\n"+"i:"+i);

        // unboxing obj to primitive datatypes
        int j=i;
        System.out.println(j);

    }
}
