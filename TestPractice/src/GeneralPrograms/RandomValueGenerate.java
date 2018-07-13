package GeneralPrograms;

import java.util.Random;

public class RandomValueGenerate {

	public static void main(String[] args) {
		 Random rand = new Random();
		for(int i=0; i<100;i++) {
			System.out.println("<GTIN>"+rand.nextInt(1000000000)+rand.nextInt(100000)+"</GTIN>");
			//System.out.println("<MarksAndNumbers1>"+rand.nextInt(1000000000)+rand.nextInt(1000000000)+rand.nextInt(1000)+"</MarksAndNumbers1>");
			//System.out.println("<MarksAndNumbers2>"+rand.nextInt(1000000000)+rand.nextInt(1000)+"</MarksAndNumbers2>");
			//System.out.println("<PartNumber1>"+rand.nextInt(1000000000)+rand.nextInt(1000)+"</PartNumber1>");
			//System.out.println("<ConsumerPackageCode>"+rand.nextInt(10000000)+rand.nextInt(100000)+"</ConsumerPackageCode>");
			
			
			System.out.println();
		}
	}

}
