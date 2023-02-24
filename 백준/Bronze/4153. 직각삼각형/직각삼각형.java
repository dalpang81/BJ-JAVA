import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();
			
			if(x == 0 && y == 0 && z == 0) {
				s.close();
				break;
			}
			
			if(x * x + y * y == z * z)
				System.out.println("right");
			else if(x * x + z * z == y * y)
				System.out.println("right");
			else if(y * y + z * z == x * x)
				System.out.println("right");
			else
				System.out.println("wrong");
			
			
		}

	}

}
