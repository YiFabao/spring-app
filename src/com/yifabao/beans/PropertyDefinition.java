package com.yifabao.beans;

/**
 * 注入的对象属性
 * @author yifabao
 *
 */
public class PropertyDefinition {
	private String name;
	private String ref;
	
	public PropertyDefinition() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PropertyDefinition(String name, String ref) {
		super();
		this.name = name;
		this.ref = ref;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	
}
