import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int check = sc.nextInt();
            if (check % 6 == 0) {
                sum += check;
            }
        }
        System.out.println(sum);
    }
}