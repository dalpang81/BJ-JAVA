import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int money = s.nextInt();
        int count = 0;

        while(money > 0)
        {
            if(money % 5 == 0)
            {
                count = money / 5 + count;
                break;
            }

            money -= 2;
            count++;
        }

        if(money < 0)
            System.out.println(-1);
        else
            System.out.println(count);

    }
}
