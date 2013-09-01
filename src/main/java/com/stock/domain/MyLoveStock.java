package com.stock.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the my_love_stock database table.
 * 
 */
@Entity
@Table(name="my_love_stock")
@NamedQuery(name="MyLoveStock.findAll", query="SELECT m FROM MyLoveStock m")
public class MyLoveStock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private float capitalInflow;

	private float currentPrice;

	private Date date;

	private float lastdayClosingPrice;

	private float maxPrice;

	private float minPrice;

	private String name;

	private float openingPrice;

	private float rate;

	private String stockId;

	private float turnover;

	private float turnoverRate;

	public MyLoveStock() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCapitalInflow() {
		return this.capitalInflow;
	}

	public void setCapitalInflow(float capitalInflow) {
		this.capitalInflow = capitalInflow;
	}

	public float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getLastdayClosingPrice() {
		return this.lastdayClosingPrice;
	}

	public void setLastdayClosingPrice(float lastdayClosingPrice) {
		this.lastdayClosingPrice = lastdayClosingPrice;
	}

	public float getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}

	public float getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getOpeningPrice() {
		return this.openingPrice;
	}

	public void setOpeningPrice(float openingPrice) {
		this.openingPrice = openingPrice;
	}

	public float getRate() {
		return this.rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public float getTurnover() {
		return this.turnover;
	}

	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}

	public float getTurnoverRate() {
		return this.turnoverRate;
	}

	public void setTurnoverRate(float turnoverRate) {
		this.turnoverRate = turnoverRate;
	}

}