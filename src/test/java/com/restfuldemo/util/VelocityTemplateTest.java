package com.restfuldemo.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.restfuldemo.entity.CityEntity;

public class VelocityTemplateTest {
	
	@Test
	public void testGetTLP(){
		CityEntity cityEntity1 = new CityEntity() ;
		cityEntity1.setCity("suzhou");
		String sql3 = VelocityTemplate.getTPL("demo3.vm", cityEntity1, "city") ;
		System.out.println("sql3 = \n" + sql3);
		
		CityEntity cityEntity2 = new CityEntity() ;
		cityEntity2.setCity_id(11);
		String sql4 = VelocityTemplate.getTPL("demo3.vm", cityEntity2, "city") ;
		System.out.println("sql4 = \n" + sql4);

		CityEntity cityEntity3 = new CityEntity() ;
		cityEntity3.setCity("suzhou");
		cityEntity3.setCountry_id(0512);
		String sql5 = VelocityTemplate.getTPL("demo3.vm", cityEntity3, "city") ;
		System.out.println("sql5 = \n" + sql5);
	}

}
