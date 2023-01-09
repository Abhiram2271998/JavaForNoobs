import java.util.Scanner;

//reverse a string
public class Q3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string :");
      String str=sc.nextLine();
      
      String rev="";
      int len=str.length();
      System.out.println("length of the string is"+len);

      for(int i=len-1;i>=0;i--){
        rev=rev+str.charAt(i);
      }
      System.out.println("reverse is :"+rev);
    }
}
