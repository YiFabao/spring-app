package com.yifabao.beanfactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.XPath;
import org.dom4j.io.SAXReader;

import com.yifabao.beans.BeanDefinition;

/**
 * 易发宝版的bean 容器
 * @author yifabao
 *
 */
public class FabaoClassPathXmlApplicationContext {
	

	/**
	 * 以数组的形式保存配置的多个bean
	 */
	private List<BeanDefinition> beanDefines = new ArrayList<BeanDefinition>();
	
	private Map<String,Object> singletons =  new HashMap<String, Object>();//存放实例化对象
	
	public FabaoClassPathXmlApplicationContext(String filename) {
		this.readXML(filename);
		this.instanceBeans();
	}

	/**
	 * 利用反射技术实例化bean对象
	 */
	private void instanceBeans() {
		for(BeanDefinition beanDefinition:beanDefines)
		{
			try {
				if(beanDefinition.getClassName()!=null&&!"".equals(beanDefinition.getClassName().trim()))
				{
					System.out.println("实例化对象："+beanDefinition.getClassName());
					singletons.put(beanDefinition.getId(),Class.forName(beanDefinition.getClassName()).newInstance());
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 获取bean实例
	 * @param beanName bean 的类名
	 * @return
	 */
	public Object getBean(String beanName){
		return this.singletons.get(beanName);
	}

	/**
	 * 读取xml配置文件中的bean信息，保存到beanDefines list数组中
	 * @param filename 配置文件名，配置文件是从类路径下读取的，配置文件要放在类路径下
	 */
	private void readXML(String filename)
	{
		SAXReader saxReader = new SAXReader();
		Document document = null;
		URL xmlpath = this.getClass().getClassLoader().getResource(filename);
		try {
			document = saxReader.read(xmlpath);
			
			Map<String,String> nsMap = new HashMap<String,String>();
			nsMap.put("ns", "http://www.springframework.org/schema/beans");//加入命名空间
			XPath xsub = document.createXPath("//ns:beans/ns:bean");//创建beans/bean查询路径
			xsub.setNamespaceURIs(nsMap);//设置命名空间
			
			List<Element> beans = xsub.selectNodes(document);//获取文档下的所有bean节点
			for(Element element:beans)
			{
				String id = element.attributeValue("id");//获取id属性
				String clazz = element.attributeValue("class");//获取class属性值
				BeanDefinition beanDefine = new BeanDefinition(id, clazz);
				
				beanDefines.add(beanDefine);
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
	}
}
