package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Review;

@Repository
public class RegistRepositoryImpl implements RegistRepository {

	@Override
	public void add(Review review) {
		/*
		System.out.println("---登録---");
		System.out.println(review);
		*/
		String url = "jdbc:sqlserver://localhost:1433;databaseName=aji_db;integratedSecurity=true;";

        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println("Connected to SQL Server using Windows Authentication!");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
