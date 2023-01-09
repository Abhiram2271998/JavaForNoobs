//factorial of num
public class Q13 {
    public static void main(String[] args) {
        int num=5;
        int i;

        long factorial=1;

        for(i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("the factorial is: "+factorial);
    }
}
