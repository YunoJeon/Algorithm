import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a * b;
            total += sum;
        }
        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}