package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class MediaFloat {

    public static void main(String[] args) throws IOException {
 
	     
		Scanner sc = new Scanner(System.in);
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();

		float media = (float) (((A * 2) + (B * 3) + (C * 5)) / 10);

		System.out.printf("MEDIA = %.1f\n", media);

		sc.close();
	}

}
