package basicsofinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicString
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] temp = str.toCharArray();
        int i = 0;
        int j = temp.length-1;

        while(i < j)
        {
            char t = temp[i];
            temp[i] = temp[j];
            temp[j] = t;
            i++;
            j--;
        }
        if(str.equals(String.valueOf(temp)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
