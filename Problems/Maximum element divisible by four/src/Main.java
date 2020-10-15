import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = 0;
//        int maxTillNow = 0;
        for (int i = 0; i < n; i++) {
            long check = sc.nextLong();
            if (check % 4 == 0 && max < check) {
                    max = check;
            }
        }
        System.out.println(max);
    }
}