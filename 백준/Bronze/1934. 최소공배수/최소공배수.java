import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            b[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            int gcd = gcd(a[i], b[i]);
            System.out.println(a[i] * b[i] / gcd);
        }

    }

    public static int gcd(int num1, int num2)
    {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }


}