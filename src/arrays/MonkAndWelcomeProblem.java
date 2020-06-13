package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndWelcomeProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        String[] temp1 = br.readLine().split(" ");
        String[] temp2 = br.readLine().split(" ");
        int[] c1 = new int[size];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = Integer.parseInt(temp1[i]);
        }
        int[] c2 = new int[size];
        for (int i = 0; i < c2.length; i++) {
            c2[i] = Integer.parseInt(temp2[i]);
        }
        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = c1[i] + c2[i];
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
