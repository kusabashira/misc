import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++)
            ls.add(scan.nextInt());
        Collections.sort(ls);

        System.out.printf("%d %d %d\n",
                ls.get(0), ls.get(1), ls.get(2));
    }
}
