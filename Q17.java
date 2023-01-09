//missing number in array
public class Q17 {
    public static void main(String[] args) {
  
        int a[]={1,2,4,5};
        int sum1=0;
        int sum2=0;

        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("the sum of didits in array is:"+sum1);

        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("sum of range of the array is:"+sum2);

        System.out.println("missing number is "+(sum2-sum1));

    }
}
