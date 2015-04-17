package com.yifabao.beans;

/**
 * 自定义的用于存放从xml文件中读取的bean配置信息
 * @author yifabao
 *
 */
public class BeanDefinition {
	private String id;
	private String className;
	
	
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
	
}
