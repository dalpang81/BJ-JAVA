import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++)
		{
			String S = s.next();
			boolean check[] = new boolean[26];
			boolean tmp = true;
			
			for(int j = 0; j < S.length(); j++)
			{
				int index = S.charAt(j) - 'a';
				if(check[index]) {
					if(S.charAt(j) != S.charAt(j - 1)) {
						tmp = false;
						break;
					}
				}
				else {
					check[index] = true;
				}
			}
			if(tmp) count++;
		}
		System.out.println(count);
		
	}
	

}
