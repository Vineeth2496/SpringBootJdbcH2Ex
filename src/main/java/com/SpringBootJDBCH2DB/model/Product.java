package com.SpringBootJDBCH2DB.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private Integer prodId;
	private String prodName;
	private Double prodCost;
	
}
