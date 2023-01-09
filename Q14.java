//sum of arrays
public class Q14 {
    public static void main(String[] args) {
        
        int a[]={5,2,7,9,6};
        int sum=0;

        //simple for loop
        // for(int i=0;i<=a.length-1;i++){
        //     sum=sum+a[i];
        // }

        //enhanced or for each loop
        for(int value:a){
            sum=sum+value;
        }

        System.out.println(sum);
    }
    
}
