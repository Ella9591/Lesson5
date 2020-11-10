import java.util.Scanner;
public class PowerOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();

        if ((a & (a - 1)) == 0) {
            System.out.println(a + " является степенью двойки");
        } else {
            System.out.println(a + " не является степенью двойки");
        }
    }
}
