import java.util.Scanner;

//number of digits in an integer
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the digits:");
        int num=sc.nextInt();
     
        int count=0;

        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("the no digits are :"+count);
    }
}
