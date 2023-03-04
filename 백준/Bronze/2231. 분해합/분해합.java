import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			int sum = 0;
			int num = i;
			
			while(num != 0) {
				sum += num % 10;
				num = num / 10;
			}

			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);

	}
}
