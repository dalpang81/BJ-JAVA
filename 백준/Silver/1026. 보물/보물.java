import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] A = new int[N];
        Integer[] A_temp = new Integer[N];
        int[] B = new int[N];
        int total = 0;

        for(int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        for(int i = 0; i < N; i++) {
            B[i] = s.nextInt();
        }

        for(int i = 0; i < N; i++)
            A_temp[i] = A[i];
        Arrays.sort(A_temp, Collections.reverseOrder());
        Arrays.sort(B);



        for(int i = 0; i < N; i++){
            int temp = 0;
            temp = A_temp[i] * B[i];
            total += temp;
        }

        System.out.print(total);
    }
}