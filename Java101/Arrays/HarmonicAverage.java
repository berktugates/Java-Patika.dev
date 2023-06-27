
public class HarmonicAverage {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        double series = 1,harmonic;
        for (int j=0; j< array.length; j++){
            series += + 1.0 / array[j];
        }
        harmonic = array.length / series;
        System.out.print("Harmonic average: " + harmonic);
    }
}