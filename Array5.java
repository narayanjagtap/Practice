//5.	Check if array is sorted

public class Array5 {
    public static void main(String[] args) {
        int data[] = {1, 2, 3, 4, 5, 6};
        boolean isSorted = true;

        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is unsorted");
        }


//Two pointer approach
        /*int data[] = {1, 2, 3, 4, 5, 6};

        int left = 0;
        int right = 1;
        boolean isSorted = true;

        while (right < data.length) {
            if (data[left] > data[right]) {
                isSorted = false;
                break;
            }
            left++;
            right++;
        }

        if (isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is unsorted"); */
    }
}

