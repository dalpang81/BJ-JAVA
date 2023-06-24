import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++)
			arr[i] = s.nextInt();
		
		Arrays.sort(arr);
		
		for(int a = 0; a < 9; a++)
		{
			for(int b = 1; b < 9; b++)
			{
				for(int c = 2; c < 9; c++)
				{
					for(int d = 3; d < 9; d++)
					{
						for(int e = 4; e < 9; e++)
						{
							for(int f = 5; f < 9; f++)
							{
								for(int g = 6; g < 9; g++)
								{
									sum = arr[a] + arr[b] + arr[c] + arr[d] + arr[e] + arr[f] + arr[g];
									
									if(sum == 100) {
										System.out.println(arr[a]);
										System.out.println(arr[b]);
										System.out.println(arr[c]);
										System.out.println(arr[d]);
										System.out.println(arr[e]);
										System.out.println(arr[f]);
										System.out.println(arr[g]);
										return;
									}
										
								}	
							}	
						}	
					}	
				}
			}
		}
		
		
		
	}
	

}
