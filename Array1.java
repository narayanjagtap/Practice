//Find the largest/smallest element in an array

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = scan.nextInt();

        int data[] = new int[size];

        System.out.println("\nto enter " + size + "elements in our array : ");
        for(int i=0; i<size; i++){
            data[i] = scan.nextInt();
        }

        System.out.println("\nBellow is our Array : ");
        for(int num : data){
            System.out.print(num + " ");
        }

        //Calculate Larages and Smallest
        int max = data[0];
        int min = data[0];

        for(int num: data){
            if (num > max) {
                max = num;
            }
        }
        for(int num : data){
            if (num<min) {
                min = num;
            }
        }
        
        System.out.println("\n\nLargest elemtnt is : " + max);
        System.out.println("Smallext element is : " + min);
    }
}