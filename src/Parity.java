import java.util.Scanner;
public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ((a & 1) == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }

    }
}
