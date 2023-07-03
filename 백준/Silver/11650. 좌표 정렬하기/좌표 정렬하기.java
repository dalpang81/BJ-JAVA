import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][] arr = new int[n][2];
		int[][] sort_arr = new int[n][2];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 2; j++)
				arr[i][j] = s.nextInt();
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0])
					return o1[1] - o2[1];
				else
					return o1[0] - o2[0];
			}
		});
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 1; j++)
				System.out.println(arr[i][j] + " " + arr[i][j+1]);
		}
		
		
	}
}

