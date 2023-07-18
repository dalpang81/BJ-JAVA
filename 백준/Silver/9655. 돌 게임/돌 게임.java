import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        if(N % 2 == 0)
            System.out.print("CY");
        else
            System.out.print("SK");
    }
}