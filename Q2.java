import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();   //1234
        

        //1.using algorithm

        // int rev=0;
        // while(num!=0){
        //     rev=rev*10+num%10;  //0*10+1234%10=4
        //     num=num/10;         //1234/10=123
        // }

        //2.using Stringbuffer class reverse method

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();

        System.out.println("the reverse of the number is: "+rev);
    }
}