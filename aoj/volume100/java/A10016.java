import java.util.Scanner;

class A10016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int m = scan.nextInt();
            int f = scan.nextInt();
            int r = scan.nextInt();
            if (m == -1 && f == -1 && r == -1)
                break;

            String grade = toGrade(m, f, r);
            System.out.println(grade);
        }
    }

    static String toGrade(int m, int f, int r) {
        if (m == -1 || f == -1) return "F";
        else if (m+f >= 80) return "A";
        else if (m+f >= 65) return "B";
        else if (m+f >= 50) return "C";
        else if (m+f >= 30 && r >= 50) return "C";
        else if (m+f >= 30) return "D";
        else return "F";
    }
}
