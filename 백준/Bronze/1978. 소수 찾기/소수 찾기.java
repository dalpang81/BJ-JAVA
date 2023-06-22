import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			int num = s.nextInt();
			
			for(int j = 2; j <= num; j++)
			{
				if(j == num)
					count++;
				if(num % j == 0)
					break;
			}
		}
		
		System.out.println(count);
	}
	

}
