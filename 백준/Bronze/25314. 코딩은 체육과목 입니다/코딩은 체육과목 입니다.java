
import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < a / 4; i++) {
      sb.append("long ");
    }
    sb.append("int");
    System.out.println(sb);
  }
}