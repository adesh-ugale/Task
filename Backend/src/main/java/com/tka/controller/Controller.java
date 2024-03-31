package com.tka.controller;
import com.tka.entity.Image;

import java.sql.*;
import com.mysql.jdbc.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

@RestController
@CrossOrigin("http://localhost:4200")
public class Controller {

	
	@Autowired
	SessionFactory factory;
	
	@PostMapping("setData")
	public boolean setImage(@RequestBody Image image)
	{
		Session session=factory.openSession();
		
		String filePath="";
		
		//Reading Image
		try {
			FileInputStream fileInputStream=new FileInputStream(filePath);
			try {
				byte[] data=new byte[fileInputStream.available()];
				fileInputStream.read();
				image.setImagedata(data);
				image.setFirstname(image.getFirstname());
				image.setLastname(image.getLastname());
				image.setEmailid(image.getEmailid());
				image.setMobno(image.getMobno());
				image.setAge(image.getAge());
				image.setState(image.getState());
				image.setCountry(image.getCountry());
				image.setTag(image.getTag());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	
		Transaction tx=session.beginTransaction();
		session.save(image);
		session.close();
		
		return true;
		
	}
	
	@GetMapping("getData/{emailid}")
	public Image getData(@PathVariable String emailid)
	{
		Session session=factory.openSession();
		
		
		Image image=session.get(Image.class,emailid);
		
		return image;
		
	}
}
