import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        long ans = 0;

        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int left = 0;
        int right = N - 1;
        ans = 0;

        //0, 음수일 경우 처리
        for(; left < right; left += 2) {
            if(arr[left] < 1 && arr[left + 1] < 1)
                ans += arr[left] * arr[left + 1];
            else
                break;
        }

        //양수일 경우 처리
        for(; right > 0; right -= 2) {
            if(arr[right] > 1 && arr[right - 1] > 1)
                ans += arr[right] * arr[right - 1];
            else
                break;
        }

        //남은 값 처리
        for(; right >= left; right--) {
            ans += arr[right];
        }

        System.out.println(ans);
    }
}