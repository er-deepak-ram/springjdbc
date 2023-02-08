package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
    	JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
    	
//    	INSERT
    	String query = "INSERT INTO student(id,name,city) VALUES(?,?,?)";
    	int result = jdbcTemplate.update(query, 456, "Deepak Ram", "Nagpur");
    	System.out.println("Number of record inserted: "+result);
    	
    	((ConfigurableApplicationContext)context).close();
    }
}
