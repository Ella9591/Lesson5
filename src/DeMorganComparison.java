public class DeMorganComparison {

    public static void main(String[] args) {
       /* boolean a = true;
        boolean b = false;
        boolean c = !(!a & !b);
        System.out.println(c); */

        boolean a = true;
        boolean b = false;

        System.out.println(a|b);
        System.out.println(!((!b)&(!b)));
    }
}

