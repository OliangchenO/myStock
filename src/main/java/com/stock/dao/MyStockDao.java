package com.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.domain.MyLoveStock;

public interface MyStockDao extends JpaRepository<MyLoveStock, Integer>{

}
