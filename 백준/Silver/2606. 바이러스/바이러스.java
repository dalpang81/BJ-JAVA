import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {

    static boolean[] visited;
    static int[][] graph;
    static int count = 0;

    static int node, line;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        visited = new boolean[node+1];
        graph = new int[node+1][node+1];

        for(int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1);

        System.out.println(count - 1);
    }

    static void dfs(int nodeIndex) {
        visited[nodeIndex] = true;
        count++;

        for(int i = 0; i <= node; i++) {
            if(graph[nodeIndex][i] == 1 && !visited[i])
                dfs(i);
        }
    }
}