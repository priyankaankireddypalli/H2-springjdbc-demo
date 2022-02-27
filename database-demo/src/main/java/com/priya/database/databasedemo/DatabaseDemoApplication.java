package com.priya.database.databasedemo;

import java.sql.Date;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.priya.database.databasedemo.entity.Person;
import com.priya.database.databasedemo.jdbc.PersonJdbcDAO;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//fir a query
		logger.info("All users-->{}",dao.findAll());
		logger.info("user id 10001-->{}",dao.findById(10001));
		logger.info("Deleting id 10002-->No of rows affected -{}",dao.deleteById(10002));
		logger.info("Inserting 10004 -> {}",dao.insert(new Person(10004,"Tara","Ballari",new Timestamp(0))));
		logger.info("update 10003 -> {}",dao.update(new Person(10003,"Pieter","Ballari",new Timestamp(0))));
	}

}
