package com.sunpengyun.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 流工具类
 * @author spy
 *
 */
public class StreamUtil {
	
	/*
	* 方法1：批量关闭流，参数能传入无限个。
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭，并且参数个数不限。
	*/
	public static void closeAll(AutoCloseable src){
		 try {
			src.close();
			System.out.println("流已经成功关闭");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(10分)，要求方法内部调用上面第1个方法关闭流(5分)
	*/
	public static String readTextFile(InputStream src){
	 BufferedReader br = new BufferedReader(new InputStreamReader(src,StandardCharsets.UTF_8));
	 byte b[] = new byte[2048];
	 int len = 0;
	 int temp = 0;
	 String stu = "";
	 try {
		while((temp=br.read())!=-1) {
			 b[len] = (byte) temp;
			 len++;
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		closeAll(src);
	}
	 return new String(b,0,len);
	}
	
	//方法3：传入文本文件对象，返回该文件内容(10分)，并且要求内部调用上面第2个方法(5分)。
	public static String readTextFile(File txtFile) throws FileNotFoundException{
		String file = "";
		FileInputStream fis = new FileInputStream(txtFile);
		file = readTextFile(fis);
		return file;
	}

}
