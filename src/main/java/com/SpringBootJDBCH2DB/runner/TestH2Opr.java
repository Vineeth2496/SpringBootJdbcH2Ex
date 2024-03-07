package com.SpringBootJDBCH2DB.runner;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.SpringBootJDBCH2DB.model.Product;
@Component
public class TestH2Opr implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	@Override
	public void run(String... args) throws Exception {
		
		String sql="SELECT * FROM PRODUCT";
		jt.query(sql, (rs,c)-> new Product(
									rs.getInt("pid"),
									rs.getString("pname"),
									rs.getDouble("pcost")	
									)).forEach(System.out::println);
		
	}

}
