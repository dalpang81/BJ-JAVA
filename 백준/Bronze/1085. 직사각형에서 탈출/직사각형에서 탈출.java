import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int y = s.nextInt();
		int w = s.nextInt();
		int h = s.nextInt();
		
		int min = 999;
		
		if(w - x < min)
			min = w - x;
		if(h - y < min)
			min = h - y;
		if(x < min)
			min = x;
		if(y < min)
			min = y;
		
		System.out.println(min);
		
		s.close();
	}

}
