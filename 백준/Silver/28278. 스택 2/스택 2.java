import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            String command = s[0];
            switch (command) {
                case "1":
                    String num = s[1];
                    stack.push(num);
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        bw.write(String.valueOf(stack.pop()));
                    } else {
                        bw.write(String.valueOf(-1));
                    }
                    bw.newLine();
                    break;
                case "3":
                    bw.write(String.valueOf(stack.size()));
                    bw.newLine();
                    break;
                case "4":
                    if (stack.isEmpty()) {
                        bw.write(String.valueOf(1));
                    } else {
                        bw.write(String.valueOf(0));
                    }
                    bw.newLine();
                    break;
                case "5":
                    if (!stack.isEmpty()) {
                        bw.write((String) stack.peek());
                    } else {
                        bw.write(String.valueOf(-1));
                    }
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}