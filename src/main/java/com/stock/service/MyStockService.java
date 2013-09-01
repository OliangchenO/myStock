package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.dao.MyStockDao;
import com.stock.domain.MyLoveStock;

@Service("stock.MyService")
@Transactional(readOnly=true) 
public class MyStockService {
	@Autowired
	private MyStockDao myStockDao;
	
	@Transactional
	public void store(MyLoveStock mystock){
		myStockDao.save(mystock);
	}
	
	@Transactional
	public void saveAll(List<MyLoveStock> myStocks){
		myStockDao.save(myStocks);
	}
	
	@Transactional
	public void deleteAll(){
		myStockDao.deleteAll();
	}
}
