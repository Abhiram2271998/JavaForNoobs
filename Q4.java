import java.util.Scanner;

//paliadrome number
public class Q4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the number:");
        int num=sc.nextInt();
        int org_num=num;
        int rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }

        System.out.println("reversed number is:"+rev);

        if(org_num==rev){
            System.out.println(rev+" is palindrome");
        }
        else{
            System.out.println(rev+" is not palinrome");
        }
    }
}
