import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int count = s.nextInt();
		for(int i = 0; i < count; i++)
		{
			int H = s.nextInt();
			int W = s.nextInt();
			int N = s.nextInt();
			
			int number = 101;
			
			for(int j = 1; j < N; j++)
			{
				if(number > H * 100)
				{
					number = (number - H * 100) + 1;
				}
				number += 100;
				
			}
			
			System.out.println(number);
		}

	}

}
