package com.epam.week4.Interests;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class compundInterest {
	private static final Logger LOGGER=LogManager.getLogger(mainCode.class);
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double compoundIntrest=0;
	int selectCompoundtype;
	Scanner sc=new Scanner(System.in);
	void takingInput()
	{
		LOGGER.info("Enter number of months:(Time period)");
		timeperiod=sc.nextInt();
		LOGGER.info("Enter principle amount:");
		principleAmount=sc.nextInt();
		LOGGER.info("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextInt();	
		LOGGER.info("Select an option:1) Annually\n 2)halfyearly \n 3)Quarterly ");
		selectCompoundtype=sc.nextInt();
	}
	public void Compound_Intrest()
	{	
			switch(selectCompoundtype)
			{
			case 1: timeperiod=timeperiod/((timeperiod/12));break;
			case 2: timeperiod=timeperiod/((timeperiod/6));break;
			case 3: timeperiod=timeperiod/((timeperiod/3));break;
			default:LOGGER.info("Enter correct Mode of Interest");
			}
			compoundIntrest=(principleAmount*Math.pow(1+((rateOfIntrest)/100),timeperiod))-(principleAmount);
			LOGGER.info("Compound Intrest:"+compoundIntrest);
	}
}
