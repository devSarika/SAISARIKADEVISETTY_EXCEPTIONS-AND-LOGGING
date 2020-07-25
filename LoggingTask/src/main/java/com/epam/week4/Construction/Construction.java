package com.epam.week4.Construction;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	public static void main(String[] args) {
		final Logger LOGGER = LogManager.getLogger(Construction.class);
		// TODO Auto-generated method stub
		LOGGER.info("Enter the size of Land in square meters:");
		Scanner sc=new Scanner(System.in);
		double landsize;
		landsize=sc.nextDouble();
		LOGGER.info("Enter the material you want to use:");
		LOGGER.info("1)Standard Material\n2)Above standard material\n3)High Standard material\n4)High standard and Fully automated house");
		int selectoption;
		selectoption=sc.nextInt();
		ConstructionCost c=new ConstructionCost();
		LOGGER.info("The total construction cost is:"+c.costcalculator(selectoption, landsize));
		sc.close();
	}
}
