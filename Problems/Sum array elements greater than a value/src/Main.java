import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        var sc = new Scanner(System.in);
        var size = sc.nextInt();
        int[] arr = new int[size];
        for (var i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int threshold = sc.nextInt();
        var sum = 0;
        for (int n : arr) {
            if (n > threshold) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}