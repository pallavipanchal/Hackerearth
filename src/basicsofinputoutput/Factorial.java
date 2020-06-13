package basicsofinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial
{
    public static int fact(int num)
    {
        if (num == 0)
            return 1;

        return num*fact(num-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int answer = fact(num);
        System.out.println(answer);

    }
}
