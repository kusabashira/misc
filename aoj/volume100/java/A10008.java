import java.util.Scanner;

class A10008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.printf("%d %d %.6f\n",
                a / b,
                a % b,
                (double)a / (double)b);
    }
}
