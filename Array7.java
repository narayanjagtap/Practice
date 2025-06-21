//7.	Find the frequency of each element

public class Array7 {
    public static void main(String[] args) {
        int data[] = {3, 56, 7, 3, 8};
        boolean visited[] = new boolean[data.length];

        for (int i = 0; i < data.length; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    count++;
                    visited[j] = true; // mark as counted
                }
            }

            System.out.println(data[i] + " occurs " + count + " times");
        }
    }
}
