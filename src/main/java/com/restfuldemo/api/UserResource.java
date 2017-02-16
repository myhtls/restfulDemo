package com.restfuldemo.api;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.commons.lang.StringUtils;

import com.restfuldemo.common.BaseAction;
import com.restfuldemo.entity.CityEntity;
import com.restfuldemo.util.VelocityTemplate;
@Path(value="/user")
@Produces("text/plain")
public class UserResource extends BaseAction{
	
//	private DBHelper helper = new DBHelper() ;
	
	/**
	 * <a href="http://localhost:8080/demoRestful/webapi/user">方法访问地址</a>
	 * @return
	 */
	@GET
	public String getUserInfo(){
		
//		String sql = "select * from city" ;
//		List<Map<String, Object>> list = helper.executeQuery(sql) ;
//		System.out.println("============= list.size() " + list.size());
		
		
		String city_id = "" ;
		String city = "suzhou" ;
		String country_id = "0512" ;

		Map<String, Object> params = new HashMap<String, Object>() ;

		if(StringUtils.isNotEmpty(city_id)){
			params.put("city_id", city_id) ;
		}
		if(StringUtils.isNotEmpty(city)){
			params.put("city", city) ;
		}
		if(StringUtils.isNotEmpty(country_id)){
			params.put("country_id", country_id) ;
		}

		/* 
		 * if params contains key "city_id", sql = 
         * 		 select 
         *               city_idcity_id,
         *               city,
         *               country_id,
         *               last_update
         *       from city t
         *       where
         *               1=1
         *               and t.city_id = :city_id
         *       order by last_update desc
         *       
         * if params contains key "city" and "country_id", then sql = 
         *       select 
         *               city_id,
         *               city,
         *               country_id,
         *               last_update
         *       from city t
         *       where
         *               1=1
         *               and t.city = :city
         *               and t.country_id = :country_id
         *       order by last_update desc
		 */
		String sql = VelocityTemplate.getTPL("demo2.vm", params) ;
		logger.info("sql = " + sql + "\n\n\n")  ;
		

		CityEntity cityEntity1 = new CityEntity() ;
		cityEntity1.setCity("suzhou");
		String sql3 = VelocityTemplate.getTPL("demo3.vm", cityEntity1, "city") ;
		logger.info("sql3 = \n" + sql3 + "\n\n\n");
		

		CityEntity cityEntity2 = new CityEntity() ;
		cityEntity2.setCity_id(11);
		String sql4 = VelocityTemplate.getTPL("demo3.vm", cityEntity2, "city") ;
		logger.info("sql4 = \n" + sql4 + "\n\n\n");


		CityEntity cityEntity3 = new CityEntity() ;
		cityEntity3.setCity("suzhou");
		cityEntity3.setCountry_id(0512);
		String sql5 = VelocityTemplate.getTPL("demo3.vm", cityEntity3, "city") ;
		logger.info("sql5 = \n" + sql5 + "\n\n\n");
		
		return "TroyLiu.Demo.";
	}
}
