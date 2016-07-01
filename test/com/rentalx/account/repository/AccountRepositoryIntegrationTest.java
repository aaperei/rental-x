package com.rentalx.account.repository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rentalx.account.Account;

public class AccountRepositoryIntegrationTest {
	
	public static void createAccount (){
		ApplicationContext context = new FileSystemXmlApplicationContext ("WebContent/WEB-INF/application-context.xml");
		
		AccountRepository accountRepository = context.getBean("accountRepository" , AccountRepository.class);
		
		//Account account = new Account ();
		
		
		
	}
	

	public static void main(String[] args) {
		
		
	}	

}
