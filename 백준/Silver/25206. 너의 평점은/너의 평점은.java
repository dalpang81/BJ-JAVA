import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double total = 0;
        double point_total = 0;

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            double tmp = 0;
            String major = st.nextToken();
            double point = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            point_total += point;
            if(score.equals("P"))
                point_total -= point;


            if(score.equals("A+"))
                tmp = point * 4.5;
            else if(score.equals("A0"))
                tmp = point * 4.0;
            else if(score.equals("B+"))
                tmp = point * 3.5;
            else if(score.equals("B0"))
                tmp = point * 3.0;
            else if(score.equals("C+"))
                tmp = point * 2.5;
            else if(score.equals("C0"))
                tmp = point * 2.0;
            else if(score.equals("D+"))
                tmp = point * 1.5;
            else if(score.equals("D0"))
                tmp = point * 1.0;
            else if(score.equals("F"))
                tmp = point * 0.0;

            total += tmp;
        }

        System.out.println(total / point_total);
    }
}