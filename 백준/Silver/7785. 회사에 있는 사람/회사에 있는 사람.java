import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> map = new HashSet<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String key = st.nextToken();
            String value = st.nextToken();

            if(value.equals("enter"))
                map.add(key);
            else
                map.remove(key);
        }

        ArrayList<String> list = new ArrayList<>(map);
        Collections.sort(list);

        for(int i = list.size()-1; i >= 0; i--)
            System.out.println(list.get(i));




    }
}