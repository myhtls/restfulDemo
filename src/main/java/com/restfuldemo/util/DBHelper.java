package com.restfuldemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBHelper {
//	private static Logger logger = LoggerFactory.getLogger(DBHelper.class) ;
//	
//    private final String url = ConfigUtil.get("database.jdbc.connectionURL") ;
//    private final String driver = ConfigUtil.get("database.jdbc.driverClass") ;
//    private final String user = ConfigUtil.get("database.jdbc.username") ;
//    private final String password = ConfigUtil.get("database.jdbc.password") ;
//    
//    private Connection conn = null ;
//    private PreparedStatement pst = null;  
//    
//    public List<Map<String, Object>> executeQuery(String sql) {  
//    	
//    	System.out.println("url = " + url) ;
//    	System.out.println("dirver = " + driver) ;
//    	System.out.println("user = " + user) ;
//    	System.out.println("password = " + password) ;
//    	
//        try {  
//            Class.forName(driver);//指定连接类型  
//            conn = DriverManager.getConnection(url, user, password);//获取连接  
//            pst = conn.prepareStatement(sql);//准备执行语句  
//            ResultSet rs = pst.executeQuery() ;
//            return resultSet2MapList(rs) ;
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }finally{
//        	this.close() ;
//        }
//        
//        return new ArrayList<Map<String, Object>>() ;
//    }  
//    
//    
//    private List<Map<String, Object>> resultSet2MapList(ResultSet rs) throws Exception{
//    	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>() ;
//    	if(rs != null && rs.next()){
//    		Map<String, Object> map = new HashMap<String, Object>() ;
//    		map.put("city_id", rs.getInt(1)) ;
//    		map.put("city", rs.getString(2)) ;
//    		map.put("country_id", rs.getInt(3)) ;
//    		map.put("last_update", rs.getDate(4)) ;
//    		list.add(map) ;
//    	}
//    	return list ;
//    }
//  
//    public void close() {  
//        try {  
//            this.conn.close();  
//            this.pst.close();  
//        } catch (SQLException e) {  
//            e.printStackTrace();  
//        }  
//    }   

}
