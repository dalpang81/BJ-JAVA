import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            long S = s.nextLong();
            long sum = 0;
            int num = 0;

            while(S >= sum) {
                num++;
                sum += num;
        }

                System.out.println(num - 1);
    }
}