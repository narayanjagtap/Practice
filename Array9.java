//9.	Remove duplicates from sorted array
public class Array9 {
    public static void main(String[] args) {
        int data[] = {1,3,4,4,4,4,5,6,7,8};
        int data1[] = new int[data.length];
        int cont = 0;

        for(int i=0; i<data.length; i++){
            if (i > 0 && data[i] == data[i - 1]) {  //This ensures the comparison only starts from the second element.
                cont ++;
                continue;
            }
            else{
                data1[i - cont] = data[i];
            }
        }
        for(int i=0; i<data1.length - cont; i++){
            System.out.println(data1[i]);
        }
    }
}
