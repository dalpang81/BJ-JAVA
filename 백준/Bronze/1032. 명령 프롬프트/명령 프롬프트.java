import java.util.*;

public class Main {
    static String underbar = "";

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       StringBuilder sb = new StringBuilder();
       Boolean isSame = true;

       int N = s.nextInt();

       String[] arr = new String[N];
       for(int i = 0; i < N; i++)
           arr[i] = s.next();

       for(int i = 0; i < arr[0].length(); i++)
       {
           char c = arr[0].charAt(i);
           isSame = true;

           for(int j = 1; j < N; j++) {
               if(c != arr[j].charAt(i)) {
                   isSame = false;
                   break;
               }
           }

           if(isSame == true)
               sb.append(c);
           else
               sb.append('?');
       }
       System.out.println(sb.toString());
    }
}