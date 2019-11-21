package com.sunpengyun.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

/**
 * 日期工具类
 * @author spy
 *
 */
public class DateUtil {
	
	/*
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	@SuppressWarnings("deprecation")
	public static Date getDateByInitMonth(Date src){
	    src.setDate(1);
	    src.setHours(0);
	    src.setMinutes(0);
	    src.setSeconds(0);
		return src;
	}
	
	public static Date getDateByFullMonth(Date src){
	   if(src.getMonth()==2) {
		   if(src.getYear()%4==0&&src.getYear()%100!=0) {
			   src.setDate(28);
		   }else {
			   src.setDate(29);
		   }
	   }
	   return null;
	}
	
	@Test
	public void testDateInit() {
		Date date = new Date();
		Date dateByInitMonth = getDateByInitMonth(date);
		System.out.println(dateByInitMonth);
	}
	

}
