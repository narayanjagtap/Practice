//8.	Print duplicates in an array
import java.util.Arrays;
    
public class Array8 {
    public static void main(String[] args) {
        int[] data = {4, 3, 2, 5, 6, 3, 2, 4, 3};

        Arrays.sort(data);  // Step 1: Sort the array

        System.out.println("Duplicates:");
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                // print only if not already printed
                if (i == 1 || data[i] != data[i - 2]) {
                    System.out.println(data[i]);
                }
            }
        }
    }
}
