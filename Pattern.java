
import java.util.Scanner;

public class Pattern {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;

            while (j <= i - 1) {
                System.out.print(' ');
                j++;
            }

            j = i;
            while (j <= n) {
                System.out.print(j);
                System.out.print(' ');
                j++;
            }
            System.out.println();
            i++;
        }

        i = n- 1;
        while (i >= 1) {
            int j = 1;

            while (j <= i - 1) {
                System.out.print(' ');
                j++;
            }

            j = i;
            while (j <= n) {
                System.out.print(j);
                System.out.print(' ');
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
