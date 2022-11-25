package com.example.DBConnection;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
@SpringBootApplication
public class DBConnectionApplication implements CommandLineRunner {

			@Autowired
			private JdbcTemplate jdbcTemplate;
			
			public static void main(String[] args) {

			}
			
			@Override
			public void run(String... args)throws Exception{
				String sql = "INSERT INTO studdb (id, name, dept, course) VALUES (?, ?, ?, ?)";
				
				int result = jdbcTemplate.update(sql, 104,"Chris", "ECE","Data Analysis");
				
				if(result>0) {
					System.out.println("ROW ADDED");
				}
			}
			

	}

