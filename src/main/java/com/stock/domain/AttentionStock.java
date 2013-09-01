package com.stock.domain;

import java.util.Date;

import lombok.*;
@Data
public class AttentionStock {
	
	private String name;
	private Date date;
	private String currentPrice;
	private String rate;
	private String lastdayClosingPrice;
	private String openingPrice;
	private String maxPrice;
	private String minPrice;
	private String capitalInflow;
	private String turnover;
	private String turnoverRate;
}
