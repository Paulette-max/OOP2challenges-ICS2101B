package pkg_oop2ch;

public class sum_recursion {
    public static int sum (int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }
    public static void main (String [] args) {
        int result = sum(6);
        System.out.println("Sum: " + result);
    }
}
