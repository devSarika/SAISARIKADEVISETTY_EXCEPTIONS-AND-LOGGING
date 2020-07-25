package com.epam.week4.Interests;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mainCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger LOGGER=LogManager.getLogger(mainCode.class);
		System.out.println("Simple intrest & Compound interest Calculator");
		boolean tobecontinued=true;
		do
		{
		LOGGER.info("1. Compound Intrest\n 2.Simple Intrest ");
		Scanner sc=new Scanner(System.in);
		int Intresttype;
		Intresttype=sc.nextInt();
			switch(Intresttype)
			{
			case 1: compundInterest ci=new compundInterest();
					ci.takingInput();
					ci.Compound_Intrest();
					break;
			case 2: simpleInterest si=new simpleInterest();
					si.takingInput();
					si.Simple_Intrest();
					break;
			default:LOGGER.info("Enter correct option");
			}
			LOGGER.info("Do you want to continue?:(true for continue / false for discontinue)");
			tobecontinued=sc.nextBoolean();
			sc.close();
		}while(tobecontinued);
	}
}
