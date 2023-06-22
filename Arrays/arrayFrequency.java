public class arrayFrequency {
    public static void repeatCounter(int[] arr, int value){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == value){
                count+=1;
            }
        }
        System.out.println(value + " value " + count + " repeated times");
    }

    public static void main(String[] args) {
        int[] array = {1,1,3,5,17,3,2,5,17,17};
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
        repeatCounter(array,1);
        repeatCounter(array,3);
        repeatCounter(array,5);
        repeatCounter(array,17);
        repeatCounter(array,2);
    }
}