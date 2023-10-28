import java.sql.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            Fibonacci(n);
            System.out.println();
        }


    }

    public static void Fibonacci(int n) {
        Stack<Integer> stackInt = new Stack<>();
        Stack<Integer> answerInt = new Stack<>();


        stackInt.add(0);
        stackInt.add(1);
        int index = 2;

        while(true) {
            int plunNum = stackInt.get(index - 1) + stackInt.get(index - 2);
            if(plunNum > n) break;
            stackInt.add(plunNum);
            index++;
        }

        int sum = 0;

        for(int j = 0; j < index - 1; j++) {
            int temp = stackInt.pop();

            if (sum + temp <= n) {
                sum += temp;
                answerInt.add(temp);
            }
        }
        Collections.sort(answerInt);

        for(int i = 0; i < answerInt.size(); i++) {
            System.out.print(answerInt.get(i) + " ");
        }
    }
}