import java.util.Scanner;

class Main {
    static int adjacentElementsProduct(int[] inputArray) {
        int max = 0;
        for (int i = 1; i < inputArray.length; i++) {
            max = Math.max(inputArray[i] * inputArray[i - 1], max);
        }
        return max;
    }
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(adjacentElementsProduct(arr));
    }
}