//paliadrome string
public class Q5 {
    public static void main(String[] args) {
        String str="madam";
        String org_str=str;
        String rev="";
        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        System.out.println("rev of string is "+rev);

        if(org_str.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

}
