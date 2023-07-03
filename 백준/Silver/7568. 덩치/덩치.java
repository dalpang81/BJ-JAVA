import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int total = 1;
		
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < 2; j++)
				arr[i][j] = s.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
					total++;
			}
			System.out.print(total + " ");
			total = 1;
		}
		
		
		
		
	}
}

