import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean stackClean (int N, int[] A) {
        Stack<Integer>[] stacks = new Stack[4];

        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }
        for (int i : A) {
            boolean placed = false;
            for (Stack<Integer> stack : stacks) {
                if (stack.isEmpty() || stack.peek() < i) {
                    stack.push(i);
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                placed = false;
            }
        }
        int cur = N;
        while (cur > 0) {
            boolean found = false;
            for (Stack<Integer> stack : stacks) {
                if (!stack.isEmpty() && stack.peek() == cur) {
                    stack.pop();
                    cur--;
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        if (stackClean(N, A)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}