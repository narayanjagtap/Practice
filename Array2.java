//2.	Sum of all elements in an array
public class Array2 {
    public static void main(String[] args) {
        int data[] = {4,3,6,2,7,6};
        int sum =0;
        for(int num : data){
            sum += num;
        }
        System.out.println("Sum of all elemetns is : " + sum);
    }
}
