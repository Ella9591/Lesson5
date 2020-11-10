import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        double money = scanner.nextDouble();

        if (year >= 0 && year <= 5) {
            money = money * 0.1 ;
            System.out.println("Премия с выслугой " + year + " г составит 10% от зп - " + money + " $");
        } else if (year >= 5 && year <= 10) {
            money = money * 1.15 - money;
            System.out.println("Премия с выслугой " + year + " г составит 15% от зп - " + money + " $");
        } else if (year >= 10 && year <= 15) {
            money = money * 1.25 - money;
            System.out.println("Премия с выслугой " + year + " г составит 25% от зп - " + money + " $");
        } else if (year >= 15 && year <= 20) {
            money = money * 1.35 - money;
            System.out.println("Премия с выслугой " + year + " г составит 35% от зп - " + money + " $");
        } else if (year >= 20 && year <= 25) {
            money = money * 1.45 - money;
            System.out.println("Премия с выслугой " + year + " г составит 45% от зп - " + money + " $");
        } else if (year >= 25) {
            money = money * 1.50 - money;
            System.out.println("Премия с выслугой " + year + " г составит 50% от зп - " + money + " $");
        }

    }
}
