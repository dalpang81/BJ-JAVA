import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Q, D, N, P;
		int tmp = 0;
		
		int T = s.nextInt();
		int arr[] = new int[T];
		
		for(int i = 0 ; i < T; i++)
			arr[i] = s.nextInt();
		
		for(int i = 0; i < T; i++)
		{
			tmp = arr[i];
			Q = tmp / 25;
			tmp %= 25;
			
			
			D = tmp / 10;
			tmp %= 10;

			N = tmp / 5;
			tmp %= 5;

			P = tmp / 1;

			System.out.println(Q + " " + D + " " + N + " " + P);
		}
		
	}

}
