import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String st = s.next();
		
		int time = 0;
		
		for(int i = 0; i < st.length(); i++)
		{
			char a = st.charAt(i);
			
			if(a >= 'A' && a <= 'C')
				time += 3;
			else if (a >= 'D' && a <= 'F')
				time += 4;
			else if (a >= 'G' && a <= 'I')
				time += 5;
			else if (a >= 'J' && a <= 'L')
				time += 6;
			else if (a >= 'M' && a <= 'O')
				time += 7;
			else if (a >= 'P' && a <= 'S')
				time += 8;
			else if (a >= 'T' && a <= 'V')
				time += 9;
			else if (a >= 'W' && a <= 'Z')
				time += 10;
		}
		
		System.out.println(time);
		
		
	}
	

}
