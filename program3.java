import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int n = (a % 2 != 0) ? a : a - 1;
        System.out.print("Output: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(2*i - 1);
            if(i != n) System.out.print(", ");
        }
    }
}
