package com.java.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class JavaExam {

	public static void main(String[] args) throws Exception {
			
//		OutputStreamWriter fos ;
		PrintWriter fos= null;
			try {
//				fos = new OutputStreamWriter(new FileOutputStream("result.txt"),"utf-8");
				FileWriter fw = new FileWriter("result.txt");
//				連接使print方法更多
				 fos = new PrintWriter(fw);
				fos.println("JAVA 黃士軒");
				fos.write(0x006a);
				fos.write(0x0061);
				fos.write(0x0076);
				fos.write(0x0061);
			fos.write(0x58EB);
			fos.write(0x8ED2);
			fos.println();
			fos.write("JAVA 黃士軒");
			fos.flush();
			
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//				finally:不論有無Exception皆要執行
			}finally {
				if(fos != null) {
					fos.close();
				}
				
			}
			
			
		


	}

}
