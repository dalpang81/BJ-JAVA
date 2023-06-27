import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int n = s.nextInt();
       int k = s.nextInt();

       int total = k;
       int sum1 = 1;
       int sum2 = 1;

       for(int i = 0; i < total; i++)
       {
           sum1 *= n;
           sum2 *= k;
           k--;
           n--;
       }
        System.out.println(sum1 / sum2);

    }



}