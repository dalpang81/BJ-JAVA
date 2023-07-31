import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int[] numCounter = new int[10];
        long total = 0;
        for(int i = 0; i < str.length(); i++) {
            int tNum = Integer.parseInt(str.substring(i, i+1));
            numCounter[tNum] += 1;
            total += tNum;
        }

        if(!str.contains("0") || total % 3 != 0)
        {
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCounter[i] > 0) {
                sb.append(i);
                numCounter[i]--;
            }
        }

        System.out.println(sb.toString());


    }
}
