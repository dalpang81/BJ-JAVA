import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();
        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == 'c')
            {
                if(i < str.length() - 1){
                    if(str.charAt(i + 1) == '=') { //c= 일 때
                        i++;
                    }
                    else if(str.charAt(i + 1) == '-') { //c- 일 때
                        i++;
                    }
                }

            }

            else if(ch == 'd')
            {
                if(i < str.length() - 1)
                {
                    if(str.charAt(i + 1) == 'z'){ //dz= 일 때
                        if(i < str.length() - 2)
                        {
                            if(str.charAt(i + 2) == '=')
                            {
                                i += 2;
                            }
                        }

                    }

                    else if(str.charAt(i + 1) == '-') //d- 일 때
                    {
                        i++;
                    }
                }

            }

            else if(ch == 'l')
            {
                if(i < str.length() - 1)
                {
                    if(str.charAt(i + 1) == 'j') //lj 일 때
                    {
                        i++;
                    }
                }

            }

            else if(ch == 'n')
            {
                if(i < str.length() - 1)
                {
                    if(str.charAt(i + 1) == 'j') //nj 일 때
                    {
                        i++;
                    }
                }

            }

            else if(ch == 's')
            {
                if(i < str.length() - 1){
                    if(str.charAt(i + 1) == '=') //s= 일 때
                    {
                        i++;
                    }
                }

            }

            else if(ch == 'z')
            {
                if(i < str.length() - 1)
                {
                    if(str.charAt(i + 1) == '=') //z= 일 때
                    {
                        i++;
                    }
                }

            }

            count++;
        }
        System.out.println(count);
    }



}