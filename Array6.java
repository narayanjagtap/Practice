//6.	Count even and odd numbers
public class Array6 {
    public static void main(String[] args) {
        int data[] = {2,3,4,6,2,6,5,9,7};

        int countEven = 0;
        int countOdd = 0;

        for(int i=0; i<data.length; i++){
            if (data[i]%2 == 0) {
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println("Even numbers : " + countEven);
        System.out.println("Odd numbers : " + countOdd);
    }
}
