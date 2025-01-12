import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int n = sc.nextInt();
            list.add(n);
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(k - 1));
    }
}