import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int M = s.nextInt();
		
		int total = 0;
		
		int[] cards = new int[N];
		for(int i = 0; i < N ; i++)
		{
			cards[i] = s.nextInt();
		}
		
		for(int i = 0; i < N; i++)
		{
			for(int j = i+1; j < N; j++)
			{
				for(int h = j + 1; h < N; h++)
				{
					int result = cards[i] + cards[j] + cards[h];
					
					if(result == M) {
						System.out.println(result);
						return;
					}
						
					else if(result < M && result > total)
						total = result;
				
				}
			}
		}
		System.out.println(total);
	}

}

