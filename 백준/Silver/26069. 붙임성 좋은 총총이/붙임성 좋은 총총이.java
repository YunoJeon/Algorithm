import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        set.add("ChongChong");

        for (int i = 0; i < n; i++) {
            String[] sArr = sc.nextLine().split(" ");
            String s1 = sArr[0];
            String s2 = sArr[1];

            if (set.contains(s1) || set.contains(s2)) {
                set.add(s1);
                set.add(s2);
            }
        }
        System.out.println(set.size());
    }
}