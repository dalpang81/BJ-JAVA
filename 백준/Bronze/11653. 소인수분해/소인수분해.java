import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i = 2;
		while(true) {
			if(n == 1)
				break;
			if(n % i == 0) {
				n /= i;
				System.out.println(i);
			}
			else
				i++;
		}
			
	}

}
