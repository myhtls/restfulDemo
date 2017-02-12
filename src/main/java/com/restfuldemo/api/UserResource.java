package com.restfuldemo.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.restfuldemo.common.BaseAction;
import com.restfuldemo.util.DBHelper;
import com.restfuldemo.util.VelocityTemplate;
@Path(value="/user")
@Produces("text/plain")
public class UserResource extends BaseAction{
	
	private DBHelper helper = new DBHelper() ;
	
	/**
	 * <a href="http://localhost:8080/demoRestful/webapi/user">方法访问地址</a>
	 * @return
	 */
	@GET
	public String getUserInfo(){
		
//		String sql = "select * from city" ;
		String sql = VelocityTemplate.getTPL("demo.vm") ;
//		List<Map<String, Object>> list = helper.executeQuery(sql) ;
//		System.out.println("============= list.size() " + list.size());
		logger.info("sql = " + sql) ;

		return "TroyLiu.Demo.";
	}
}
