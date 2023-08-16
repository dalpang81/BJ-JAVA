import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int J = Integer.parseInt(br.readLine());

        int left = 1;
        int right = M;
        int sum = 0;

        for(int i = 0; i < J; i++) {
            int where = Integer.parseInt(br.readLine());

            //바구니 안에 떨어지는 경우
            if(left <= where && where <= right)
                continue;

            //바구니 왼쪽에 가깝게 떨어지는 경우
            if(left > where) {
                sum += left - where;
                right -= left - where;
                left = where;
            }

            //바구니 오른쪽에 가깝게 떨어지는 경우
            else {
                sum += where - right;
                left += where - right;
                right = where;
            }
        }
        System.out.println(sum);
    }
}