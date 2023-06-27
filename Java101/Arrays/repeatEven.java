
public class repeatEven {
    public static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {2,4,4,9,31,47,68,2,93,45,68,31,47};
        int[] even = new int[array.length];
        int n = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(!isFind(even,array[i])){
                    if((i!=j) && (array[i] == array[j]) && (array[i] % 2 == 0)){
                        even[n++] = array[j];
                    }
                }
            }
        }

        for(int a : even){
            System.out.print(a + " ");
        }
    }
}