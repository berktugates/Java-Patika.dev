public class primeNumbers {
    public static void main(String[] args) {
        int i,j,count=0;

        for(i=2; i<=100; i++){
            count=0;
            for(j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.print(i+" ");
            }
        }
    }
}