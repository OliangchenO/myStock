package com.springtour.stock.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:context-infrastructure-ws.xml" })
public class ChinaStockWebServiceSoapTest {
	@Autowired
	private ChinaStockWebServiceSoap target;

	@Test
	public void test() throws ParseException {
		List<String> stockCodes = Arrays.asList("SZ000905", "SZ002177",
				"SZ000937", "SZ002282", "SH603128", "SZ002021", "SH600609");
		Iterator<String> stockCodesIterator = stockCodes.iterator();
		while (stockCodesIterator.hasNext()) {
			ArrayOfString s = target.getStockInfoByCode(stockCodesIterator
					.next());
			List<String> info = s.string;
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = fmt.parse(info.get(2));
			System.out.print(info.get(1) + "," + info.get(3) + ","
					+ info.get(9) + "," + date);
			System.out.println();
		}
	}
}
