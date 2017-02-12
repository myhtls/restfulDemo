package com.restfuldemo.util ;

import java.util.ResourceBundle;

/**
 * 项目参数工具类
 * 
 * @author TroyLiu
 * 
 */
public class ConfigUtil {

	private static final ResourceBundle bundle = java.util.ResourceBundle.getBundle("/config/service.properties");

	/**
	 * 通过键获取值
	 * 
	 * @param key
	 * @return
	 */
	public static final String get(String key) {
		return bundle.getString(key);
	}
	
	public static void main(String[] args) {
	}

}
