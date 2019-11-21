package com.sunpengyun.common.utils;

import java.io.File;

import org.junit.Test;

/**
 * 文件工具类
 * @author spy
 *
 */
public class FileUtil {
	
	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
	*/
	public static String getExtendName(String fileName){
		int i = fileName.lastIndexOf(".");
		String substring = fileName.substring(i);
		return substring;
	}
	
	@Test
	public void testFile() {
	   String extendName = getExtendName("aaa.jpg");
	   System.out.println(extendName);
	}
	

}
