package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyStream {
	void copyByByte(String inputPath, String outputPath) {
		try {
			InputStream iFile = new FileInputStream(inputPath);
			OutputStream oFile = new FileOutputStream(outputPath);
			int index=0;
			while (true) {
				int iEOF = iFile.read();
				if (iEOF != -1) {
					index++;
					oFile.write(iEOF);
					System.out.println("index: "+index+" - "+iEOF);
				} else {
					break;
				}
			}
			iFile.close();
			oFile.close();
		} catch (IOException ex) {
			System.err.println(ex);
		} 
	}

	public static void main(String[] args) {
		CopyStream cs=new CopyStream();
//		String inputFilePath=new String("F:\\git\\learnJava\\etc\\1.txt");
//		String outputFilePath=new String("F:\\git\\learnJava\\etc\\2.txt");
		String inputFilePath=new String("F:\\git\\learnJava\\etc\\2.PNG");
		String outputFilePath=new String("F:\\git\\learnJava\\etc\\3.PNG");
		cs.copyByByte(inputFilePath, outputFilePath);
	}
}
