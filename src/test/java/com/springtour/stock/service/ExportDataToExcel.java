package com.springtour.stock.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-infrastructure-ws.xml" })
public class ExportDataToExcel {
	@Autowired
	private ChinaStockWebServiceSoap target;

	@Test
	public void exportData() throws Exception {
		List<String> stockCodes = Arrays.asList("SZ000905", "SZ002177",
				"SZ000937", "SZ002282", "SH603128", "SZ002021", "SH600609");
		Iterator<String> stockCodesIterator = stockCodes.iterator();
		while (stockCodesIterator.hasNext()) {
			ArrayOfString s = target.getStockInfoByCode(stockCodesIterator
					.next());
			List<String> info = s.string;
			FileInputStream fs = new FileInputStream("d:/myStock.xls");
			POIFSFileSystem ps = new POIFSFileSystem(fs);
			HSSFWorkbook wb = new HSSFWorkbook(ps);
			HSSFSheet sheet = wb.getSheetAt(0);
			HSSFRow row = sheet.getRow(0);
			System.out.println(sheet.getLastRowNum() + "  "
					+ row.getLastCellNum());
			FileOutputStream out = new FileOutputStream("d:/myStock.xls");
			row = sheet.createRow((short) (sheet.getLastRowNum() + 1));
			row.createCell((short) 0).setCellValue(22);
			row.createCell((short) 1).setCellValue(11);
			row.createCell((short) 2).setCellValue(11);
			row.createCell((short) 3).setCellValue(11);
			row.createCell((short) 4).setCellValue(11);
			row.createCell((short) 5).setCellValue(11);
			row.createCell((short) 6).setCellValue(11);
			row.createCell((short) 7).setCellValue(11);
			row.createCell((short) 8).setCellValue(11);
			row.createCell((short) 9).setCellValue(33);
			out.flush();
			wb.write(out);
			out.close();
			System.out.println(row.getPhysicalNumberOfCells() + "  "
					+ row.getLastCellNum());
		}
	}
}
