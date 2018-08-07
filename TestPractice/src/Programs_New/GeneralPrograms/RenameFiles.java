package GeneralPrograms;

import java.io.File;

public class RenameFiles {
	public static void main(String[] args) {

		/*
		 * File oldfile = new File(
		 * "D:\\BUSINESS DATA\\3PL\\Generic Test File\\Input Files\\8322482646-Office Max-856.dat"
		 * ); File newfile = new File(
		 * "D:\\BUSINESS DATA\\3PL\\Generic Test File\\Input Files\\Office Max-856-8322482646.dat"
		 * );
		 * 
		 * if (oldfile.renameTo(newfile)) { System.out.println("File renamed"); } else {
		 * System.out.println("Sorry! the file can't be renamed"); }
		 */

		File folder = new File("D:\\BUSINESS DATA\\3PL\\Generic Test File\\Input Files");

		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String fileName = listOfFiles[i].getName();
				System.out.println("File " + listOfFiles[i].getName());
				int indexFirstHypen = fileName.indexOf("-");
				System.out.println(indexFirstHypen);

				String afterHypen = fileName.substring(indexFirstHypen + 1);
				System.out.println(afterHypen);

				File oldfile = new File(
						"D:\\BUSINESS DATA\\3PL\\Generic Test File\\Input Files\\"+fileName);
				File newfile = new File(
						"D:\\BUSINESS DATA\\3PL\\Generic Test File\\Input Files\\"+afterHypen);

				if (oldfile.renameTo(newfile)) {
					System.out.println("File renamed");
				} else {
					System.out.println("Sorry! the file can't be renamed");
				}
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
			}
		}

	}
}
