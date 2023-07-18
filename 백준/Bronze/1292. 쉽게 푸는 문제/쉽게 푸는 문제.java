import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        int[] arr = new int[1002];
        int count = 1;

        for(int i = 1; i <= 1000; i++)
        {
            for(int j = 0; j < i; j++) {
                if(count == 1001) break;
                arr[count] = i;
                count++;
            }
        }

        int sum = 0;
        for(int i = A; i <= B; i++) {
            sum += arr[i];
        }

        System.out.print(sum);
    }
}