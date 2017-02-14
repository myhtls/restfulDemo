package com.restfuldemo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceUtils {
	private static final String UTF_8 = "UTF-8";
	private static final String EMPTY_JSON = "{}";
	protected static final Logger logger = LoggerFactory.getLogger(ResourceUtils.class);

	private static String jsonName(String name) {
		return "json/" + name + ".json";
	}

//	public static String asJsonString(String name) {
//		try {
//			File jsonFile = new File(getPath(jsonName(name)));
//			return FileUtils.readFileToString(jsonFile, UTF_8);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			return EMPTY_JSON;
//		}
//	}
//
//	public static String asString(String resource) {
//		try {
//			File jsonFile = new File(getPath(resource));
//			return FileUtils.readFileToString(jsonFile, UTF_8);
//		} catch (Exception e) {
//			logger.error(e.getMessage(), e);
//			return null;
//		}
//	}

	public static boolean exists(String resource) {
		try {
			return new File(getPath(resource)).exists();
		} catch (Exception e) {
			logger.error("Resource[{}] not exists: {}", resource, e);
			return false;
		}
	}

	public static String getPath(String resource) {
		logger.info(" ========= resource = " + resource ) ;
		return Thread.currentThread().getContextClassLoader().getResource(resource).getPath();
	}

	public static Properties asProps(String resource) {
		Properties props = new Properties();
		InputStream in = null;
		try {
			in = new FileInputStream(new File(getPath(resource)));
			props.load(in);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			IOUtils.closeQuietly(in);
		}
		return props;
	}

	public static void main(String[] args) {
//		System.out.println(ResourceUtils.asJsonString("SinaTGSite"));
	}
}
