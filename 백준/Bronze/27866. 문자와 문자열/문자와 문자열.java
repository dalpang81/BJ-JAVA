import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		int n = s.nextInt();
		
		String[] arr = str.split("");
		
		System.out.println(arr[n-1]);
		
		
	}
}

