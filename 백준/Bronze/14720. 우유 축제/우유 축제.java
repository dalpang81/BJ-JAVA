import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr = new int[N];

        for(int i = 0 ; i< N; i++) {
            arr[i] = s.nextInt();
        }

        int count = 0;
        String state = "strawberry";

        for(int i = 0; i < N; i++) {
            if(state.equals("strawberry") && arr[i] == 0) {
                count++;
                state = "chocolate";
            }

            else if(state.equals("chocolate") && arr[i] == 1) {
                count++;
                state = "banana";
            }

            else if(state.equals("banana") && arr[i] == 2){
                count++;
                state = "strawberry";
            }
        }


        System.out.println(count);
    }

}