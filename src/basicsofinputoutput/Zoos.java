package basicsofinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoos
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] temp = input.toCharArray();
        int countZ = 0;
        int countO = 0;
        for(int i = 0;i<temp.length;i++)
        {
            if(temp[i] == 'z')
            {
                countZ = countZ+1;
            }
            else if(temp[i] == 'o')
            {
                countO = countO+1;
            }
        }
        if(countO == (countZ *2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
