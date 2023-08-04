import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'U' && count == 0)
                count++;
            else if(str.charAt(i) == 'C'&& count == 1)
                count++;
            else if(str.charAt(i) == 'P' && count == 2)
                count++;
            else if(str.charAt(i) == 'C' && count == 3)
                count++;
        }

        if(count == 4)
            System.out.println("I love UCPC");
        else
            System.out.println("I hate UCPC");

    }

}