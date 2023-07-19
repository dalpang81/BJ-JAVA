import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int money = s.nextInt();
        int[] arr = { 500, 100, 50, 10, 5, 1 };
        int count = 0;

        money = 1000 - money;
        for(int i = 0; i < 6; i++){
            int temp = 0;
            temp = money / arr[i];
            count += temp;
            money = money - (arr[i] * temp);
        }

        System.out.print(count);


    }
}