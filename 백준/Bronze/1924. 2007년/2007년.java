import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int month = s.nextInt();
		int date = s.nextInt();
		
		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int n = 0;
		
		for(int i = 0; i < month; i++)
			n += months[i];
		
		n += date - 1;
		System.out.println(days[n % 7]);
			
	}
	

}
