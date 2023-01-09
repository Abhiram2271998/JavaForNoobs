public class Q18 {
    public static void main(String[] args) {
        
        int a[]={50,30,10,20,60};

        int max=a[0];

        for(int i=1;i<a.length;i++){

            if(a[i]>max){
                a[i]=max;
            }
        }
        System.out.println("maximum value is:"+max);

        int min=a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]<min){
               min=a[i];
            }
        }
        System.out.println("minimum:"+min);
        }
}
