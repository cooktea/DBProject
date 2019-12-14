package com.kiwi.dbproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kiwi.dbproject.mapper")
public class DbProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbProjectApplication.class, args);
	}

}
