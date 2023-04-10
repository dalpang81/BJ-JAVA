import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int num = n;
        
        for(int i = 0; i < num; i++)
        {
        	for(int j = 0; j < n; j++)
        	{
            	System.out.print("*");	
        	}
        	System.out.println("");
        	n--;


        }
    }
}
