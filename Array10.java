//10.	Merge two arrays
public class Array10 {
    public static void main(String[] args) {
        int data1[] = {1,2,3};
        int data2[] = {4,5,6};

        int data3[] = new int[data1.length + data2.length];

        for(int i=0; i<data1.length; i++){
            data3[i] = data1[i];
        }
        for(int i=0; i<data2.length; i++){
            data3[data1.length + i] = data2[i];
        }

        for(int j=0; j<data3.length; j++){
            System.out.println(data3[j]);
        }
    }
}
