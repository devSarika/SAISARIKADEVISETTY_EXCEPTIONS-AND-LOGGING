package com.epam.week4.Construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static Logger LOGGER=LogManager.getLogger(Construction.class);
	public double costcalculator(int option,double area)
	{
		switch (option) {
		case 1:return 1200*area;
		case 2:return 1500*area;
		case 3:return 1800*area;
		case 4:return 2500*area;
		default:
			LOGGER.info("Choose correct Option");
		}
		return 0;
	}
}
