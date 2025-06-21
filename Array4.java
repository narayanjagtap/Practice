//4.	Find the second largest element
public class Array4 {
    public static void main(String[] args) {
        int data[] = {4, 6, 7, 9, 2, 4};
        int max = Integer.MIN_VALUE;    //that both max and secMax variables are initialized with the smallest possible value an int can hold in Java.
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                secMax = max;
                max = data[i];
            } else if (data[i] > secMax && data[i] != max) {
                secMax = data[i];
            }
        }

        if (secMax == Integer.MIN_VALUE)
            System.out.println("Second largest doesn't exist.");
        else
            System.out.println("Second largest element is: " + secMax);

        /*  Arrays.sort(data);
            int max = data[data.length - 1];

            for (int i = data.length - 2; i >= 0; i--) {
                if (data[i] != max) {
                System.out.println("Second largest is: " + data[i]);
                break;
                }
            }
        */
    }
}
