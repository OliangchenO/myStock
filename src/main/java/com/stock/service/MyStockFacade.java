package com.stock.service;

import static com.stock.util.StockUtils.*;

import java.lang.annotation.Target;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.stock.domain.MyLoveStock;
import com.stock.webservice.ArrayOfString;
import com.stock.webservice.ChinaStockWebServiceSoap;

public class MyStockFacade {
	
	private ChinaStockWebServiceSoap soap;
	@Autowired
	private MyStockService myStockService;

	public void setMyStockService(MyStockService myStockService) {
		this.myStockService = myStockService;
	}

	public void setSoap(ChinaStockWebServiceSoap soap) {
		this.soap = soap;
	}
	
	public void storeStock(){
		List<String> stockCodes = Arrays.asList("SZ000905", "SZ002177",
				"SZ000937", "SZ002282", "SH603128", "SZ002021", "SH600609");
		Iterator<String> stockCodesIterator = stockCodes.iterator();
		while (stockCodesIterator.hasNext()) {
			ArrayOfString s = soap.getStockInfoByCode(stockCodesIterator
					.next());
			List<String> info = s.getString();
			MyLoveStock stock = new MyLoveStock();
			stock.setStockId(info.get(0));
			stock.setName(info.get(1));
			DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = null;
			try {
				date = fmt.parse(info.get(2));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			stock.setDate(date);
			stock.setCurrentPrice(valueOf(info.get(3)));
			stock.setLastdayClosingPrice(valueOf(info.get(4)));
			stock.setOpeningPrice(valueOf(info.get(5)));
			stock.setMinPrice(valueOf(info.get(7)));
			stock.setMaxPrice(valueOf(info.get(8)));
			stock.setRate(valueOf(info.get(9).split("%")[0]));
			stock.setTurnover(valueOf(info.get(10)));
			myStockService.store(stock);
		}
	
	}
}
