package com.restfuldemo.util;

import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VelocityTemplate {
	protected static final Logger logger = LoggerFactory.getLogger(VelocityTemplate.class);
	private static final VelocityContext EMPTY_VC = new VelocityContext();

	public static String getTPL(String vm) {
		try {
			StringWriter result = new StringWriter();
			Template t = Velocity.getTemplate(vm);
			t.merge(EMPTY_VC, result);
			return result.toString();
		} catch (Exception e) {
			throw new RuntimeException("Parse vm tpl failed", e);
		}
	}

	public static String getTPL(String vm, Object model) {
		return getTPL(vm, model, "model");
	}

	public static String getTPL(String vm, Object model, String modelKey) {
		try {
			VelocityContext vc = new VelocityContext();
			vc.put(modelKey, model);
			StringWriter result = new StringWriter();
			Template t = Velocity.getTemplate(vm);
			t.merge(vc, result);
			return result.toString();
		} catch (Exception e) {
			throw new RuntimeException("Parse vm tpl failed", e);
		}
	}

	static {
		try {
			Properties props = ResourceUtils.asProps("/config/velocity.properties");
			props.put(VelocityEngine.FILE_RESOURCE_LOADER_PATH, ResourceUtils.getPath("vm"));
			Velocity.init(props);
			logger.info("Velocity [{}] inited", props);
		} catch (Exception e) {
			throw new RuntimeException("Exception occurs while initialzie the velociy: " + e.getMessage(), e);
		}
	}

}
