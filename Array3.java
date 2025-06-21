//3.	Reverse an array

public class Array3 {
    public static void main(String[] args) {
        int num[] = {4,5,9,7,3};
        
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i] + "  ");
        }

//other way
        /*  int[] original = {4, 5, 9, 7, 3};
            int[] reversed = new int[original.length];

            for (int i = 0; i < original.length; i++) {
                reversed[i] = original[original.length - 1 - i];
            }
         */
    }
}
