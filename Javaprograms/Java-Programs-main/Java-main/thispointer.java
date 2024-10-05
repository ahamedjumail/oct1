class boxes{
    int leng;
    int breadth;
    int weight;

    void setdim(int leng,int breadth,int weight){       // this pointer 
        this.leng=leng;
        this.breadth=breadth;
        this.weight=weight;
    }
  
    
    int volume(){
        return leng*breadth*weight;
    }
}

public class thispointer {
    public static void main(String[] args) {
        boxes n = new boxes();
        n.setdim(12, 12, 10);
        System.out.println(n.volume());
    }
}
