import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String A = s.next();
        String B = s.next();

        String maxA = "";
        String maxB = "";
        String minA = "";
        String minB = "";

        for(int i = 0; i < A.length(); i++)
        {
            if(A.charAt(i) == '5' || A.charAt(i) == '6') {
                minA += 5;
                maxA += 6;
            }
            else {
                minA += A.charAt(i);
                maxA += A.charAt(i);
            }
        }

        for(int i = 0; i < B.length(); i++) {
            if(B.charAt(i) == '5' || B.charAt(i) == '6') {
                minB += 5;
                maxB += 6;
            }
            else {
                minB += B.charAt(i);
                maxB += B.charAt(i);
            }
        }

        int min = Integer.parseInt(minA) + Integer.parseInt(minB);
        int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
        System.out.print(min + " " + max);
    }
}