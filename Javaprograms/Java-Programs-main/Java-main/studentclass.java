import java.util.Scanner;

class student{
    String name;
    int rollno;
    int marks[]=new int[5];

    void invoke(){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollno);
        System.out.println("marks : "+marks[0]);
        // return 0;
    }
}



public class studentclass {
    public static void main(String[] args) {
        student a=new student();
        a.name="Arunvijay";
        a.rollno=016;
        Scanner scan=new Scanner(System.in);
        // System.out.println();
        for (int i=0;i<=4;i++){
            System.out.println("Enter subject marks:");
            a.marks[i]=scan.nextInt();
        }
        a.invoke();

    }
}
