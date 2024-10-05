class op1{
    int data=50;

    void update(int data){
        data=data+100;
        System.out.println("Value inside class:"+data);     // changes will be in  local variable data
    }
}


class operation{
    int val=50;
    void change(operation op){
        op.val=op.val+100;

    }
}

public class callby {
    public static void main(String[] args) {
        op1 o=new op1();
        o.update(500);
        System.out.println("After change"+o.data);

        operation op =new operation();
        System.out.println("before change :"+op.val);
        op.change(op);
        System.out.println("after change :"+op.val);
    }
}
