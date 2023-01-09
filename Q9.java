import java.util.Scanner;

//largest of 3 numbers
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("eneter number a");
        int a=sc.nextInt();

        System.out.println("eneter number b");
        int b=sc.nextInt();

        System.out.println("eneter number c");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is the gratest");
        }

        if(b>a && b>c){
            System.out.println(b+" is the gratest");
        }

        if(c>b && c>a){
            System.out.println(c+" is the gratest");
        }



    }
}
