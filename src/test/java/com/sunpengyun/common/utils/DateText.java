package com.sunpengyun.common.utils;

import java.util.Date;

import org.junit.Test;

public class DateText {
	
	DateUtil dt = new DateUtil();
	
    @Test
    public void testDate() {
    	Date date = new Date();
    	String sql = "select * from t_order where create_time>="+dt.getDateByInitMonth(date)+" and create_time<="+dt.getDateByFullMonth(date);
    	//打印sql
    	System.out.println(sql);
    }
	

}
