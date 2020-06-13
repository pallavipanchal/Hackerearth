package basicsofinputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoyAndProfilePicture {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minDim = Integer.parseInt(br.readLine());
        int numberPhotos = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberPhotos; i++) {
            String[] input = br.readLine().split(" ");
            int W = Integer.parseInt(input[0]);
            int H = Integer.parseInt(input[1]);
            if (W < minDim || H < minDim)
                System.out.println("UPLOAD ANOTHER");
            else if (W == H)
                System.out.println("ACCEPTED");
            else if (W > minDim || H > minDim)
                System.out.println("CROP IT");


        }

    }
}
