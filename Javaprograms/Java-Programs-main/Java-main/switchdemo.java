import java.util.Scanner;

public class switchdemo {

    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no:");
        a=scanner.nextInt();
        System.out.println("enter another no:");
        b=scanner.nextInt();
        char op;
        System.out.println("Enter operator :");
        op=scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a+"+"+b+"="+(a+b));
                break;
        // similarly for -*/
            default:
                System.out.println("no a specific operator");
        }

    }
}