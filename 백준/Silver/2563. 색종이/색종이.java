import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); //색종이 갯수
        int total = 0;      //검은 영역의 넓이
        boolean[][] arr = new boolean[101][101]; //도화지

        for(int i = 0; i < n; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(!arr[j][k]) {
                        arr[j][k] = true;
                        total++;
                    }
                }
            }
        }
        System.out.print(total);
    }
}
