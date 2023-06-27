import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int n = s.nextInt();
       int k = s.nextInt();

       System.out.println(factorial(n)/ (factorial(n - k) * factorial(k)));

    }

    static int factorial(int N)
    {
        if(N <= 1)
            return 1;
        return N * factorial(N - 1);
    }



}