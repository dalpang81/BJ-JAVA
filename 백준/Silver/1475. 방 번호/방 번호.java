import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String N = s.next();
        int[] arr = new int[10];

        for(int i = 0; i < N.length(); i++) {
            int num = Character.getNumericValue(N.charAt(i));
            if(num == 6)
                arr[9]++;
            else arr[num]++;
        }

        int max = 0;
        for(int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        int nine = arr[9] / 2;
        if(arr[9] % 2 == 1) nine++;
        max = Math.max(max, nine);
        System.out.print(max);

    }
}
