package com.yifabao.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的用于存放从xml文件中读取的bean配置信息
 * @author yifabao
 *
 */
public class BeanDefinition {
	private String id;
	private String className;
	/**
	 * bean 中要注入的对象和属性
	 */
	private List<PropertyDefinition> propertys = new ArrayList<PropertyDefinition>();
	
	public BeanDefinition() {
		super();
	}
	
	public BeanDefinition(String id, String className) {
		super();
		this.id = id;
		this.className = className;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public List<PropertyDefinition> getPropertys() {
		return propertys;
	}

	public void setPropertys(List<PropertyDefinition> propertys) {
		this.propertys = propertys;
	}
	
	
}
