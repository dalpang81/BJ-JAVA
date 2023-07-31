import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String res = "";
        res = poliomino(str);
        System.out.println(res);
    }

    private static String poliomino(String s) {
        String ans = "";
        String A = "AAAA", B = "BB";

        s = s.replaceAll("XXXX", A);
        ans = s.replaceAll("XX", B);

        if(ans.contains("X"))
            ans = "-1";

        return ans;
    }

}
