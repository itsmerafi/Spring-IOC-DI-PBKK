package com.arrafi.bookapp.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arrafi.bookapp.book.*;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		System.out.println("Java Config");
		System.out.println("1. MathematicDiscrete \n2.ApiTauhid");
		System.out.println("Masukkan Nomor Buku Untuk Mendapatkan Detail Buku :");
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		int choice = myObj.nextInt();  // Read user input
		
		
		if(choice==1) {
			Book book = context.getBean("DiscreteMathematic", Book.class);
			DiscreteMathematic book1 = (DiscreteMathematic) book;
			System.out.println(book1.toString());
		}
		else if(choice==2) {
			Book book = context.getBean("ApiTauhid", Book.class);
			ApiTauhid book2 = (ApiTauhid) book;
			System.out.println(book2.toString());
		}
		else {
			System.out.println("Input Salah");
		}

	
		context.close();
	}

}
