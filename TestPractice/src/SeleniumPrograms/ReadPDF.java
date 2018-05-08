package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import junit.framework.Assert;

public class ReadPDF {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\shriniwas.alle\\Desktop\\cvs.pdf");
		
		FileInputStream fin = new FileInputStream(file);
		
		PDFParser parse = new PDFParser(fin);
		
		parse.parse();
		
		COSDocument cosDoc = parse.getDocument();
		
		PDDocument pdDoc = new PDDocument(cosDoc);
		
		PDFTextStripper stripper = new PDFTextStripper();
		
		String data = stripper.getText(pdDoc);
		
		//System.out.println(data);
		
		Assert.assertTrue(data.contains("Implementation Guide for"));
		
		cosDoc.close();
		pdDoc.close();
		
		System.out.println("Text found in the PDF file");
		
		
	}

}
