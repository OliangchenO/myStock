package com.stock.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StockUtils {
	public static String getTime(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss",Locale.SIMPLIFIED_CHINESE);
		return sdf.format(date);
	}
	
	public static float valueOf(String s){
		return Float.valueOf(s);
	}
}
