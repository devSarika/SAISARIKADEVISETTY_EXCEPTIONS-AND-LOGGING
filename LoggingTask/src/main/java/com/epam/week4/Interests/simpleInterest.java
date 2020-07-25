package com.epam.week4.Interests;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class simpleInterest {
	private static final Logger LOGGER=LogManager.getLogger(mainCode.class);
	double principleAmount;
	double time;
	double ROI;
	double simpleIntrest=0;
	Scanner sc=new Scanner(System.in);
	void takingInput()
	{
		LOGGER.info("Enter number of months:(Time period)");
		time=sc.nextInt();
		LOGGER.info("Enter principle amount:");
		principleAmount=sc.nextInt();
		LOGGER.info("Enter Rate of Intrest:");
		ROI=sc.nextInt();		
	}
	public void Simple_Intrest()
	{
		time=time/12;
		simpleIntrest=(principleAmount*time*ROI)/100;
		LOGGER.info("Simple Intrest:"+simpleIntrest);
	}
}
