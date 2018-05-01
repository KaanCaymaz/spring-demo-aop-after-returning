package com.luv2code.aopdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
		List<Account> accounts = new ArrayList<>();
		try {
			boolean wire = true;
			accounts = accountDao.findAccounts(wire);
		} catch (Exception exp) {
			System.out.println("\nMainApp catch an Exception:  " + exp);
		}
		
		System.out.println("\n\n MainProgram AfterThrowingDemoApp");
		System.out.println("-------------");
		System.out.println(accounts);
		
		context.close();

	}
}
