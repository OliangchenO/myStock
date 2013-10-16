package com.stock.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.webservice.ArrayOfString;
import com.stock.webservice.ChinaStockWebServiceSoap;

public class MyStockDataExportToXML {
	public static void main(String[] args) throws IOException{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:context-infrastructure-ws.xml"});
		ChinaStockWebServiceSoap chinaStockWebServiceSoap = ctx.getBean("stock.ChinaStockWebServiceSoapWsFacade",ChinaStockWebServiceSoap.class);
		List<String> stockCodes = Arrays.asList("SZ000905", "SZ002177",
				"SZ000937", "SZ002282", "SH603128", "SZ002021", "SH600609");
		Iterator<String> stockCodesIterator = stockCodes.iterator();
		while (stockCodesIterator.hasNext()) {
			ArrayOfString s = chinaStockWebServiceSoap.getStockInfoByCode(stockCodesIterator
					.next());
			List<String> info = s.getString();
			System.out.println(info);
	}
	}
}
