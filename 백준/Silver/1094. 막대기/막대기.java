import java.util.*;

public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int X = s.nextInt();

            int count = 0;
            int stick = 64;

            while(X > 0) {
                if(stick > X) stick /= 2;

                else {
                    count++;
                    X -= stick;
                }
            }
        System.out.println(count);
    }
}