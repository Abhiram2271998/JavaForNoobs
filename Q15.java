//even and odd numbers in an array
public class Q15 {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6};
        int i;
        System.out.println("even values are.....");
        for(i=0;i<a.length;i++){
            if(a[i]%2==0)
            System.out.println(a[i]);
        }

        System.out.println("even values are.....by echanced for loop");

        for(int value :a){
            if(value%2==0)
            System.out.println(value);
        }

        System.out.println("odd values are.....");
        for(i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }

        System.out.println("odd values are.....by echanced for loop");
        for(int value:a){
            if(value%2!=0){
                System.out.println(value);
            }
        }

    }
}
