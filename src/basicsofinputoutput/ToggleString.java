package basicsofinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i)))
                sb.append(String.valueOf(input.charAt(i)).toLowerCase());
            else
                sb.append(String.valueOf(input.charAt(i)).toUpperCase());
        }
        System.out.println(sb.toString());

    }
}
