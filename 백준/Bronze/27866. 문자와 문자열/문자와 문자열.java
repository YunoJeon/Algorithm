import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        char[] charArr = S.toCharArray();

        System.out.println(charArr[i - 1]);
    }
}