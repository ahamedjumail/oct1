class box{
    int leng;
    int breadth;
    int weight;

    int volume(){
        return leng*breadth*weight;
    }
}


public class classdemo {
    public static void main(String[] args) {
        box b = new box();
        b.leng=10;
        b.breadth=5;
        b.weight=4;
        System.out.println((b.volume()));

    }
    
}
