import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String command = s[0];

            switch (command) {
                case "1" :
                    int num = Integer.parseInt(s[1]);
                    deque.addFirst(num);
                    break;
                case "2" :
                    int num2 = Integer.parseInt(s[1]);
                    deque.addLast(num2);
                    break;
                case "3" :
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.removeFirst()).append("\n");
                    }
                    break;
                case "4" :
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.removeLast()).append("\n");
                    }
                    break;
                case "5" :
                    sb.append(deque.size()).append("\n");
                    break;
                case "6" :
                    sb.append(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case "7" :
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                case "8" :
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}