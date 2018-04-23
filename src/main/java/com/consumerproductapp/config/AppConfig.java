package com.consumerproductapp.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.consumerproductapp.model.Consumerentity;
import com.consumerproductapp.model.Productentity;

@Configuration
@PropertySource("classpath:db.properties")
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "com.consumerproductapp")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
     
    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    @Bean
    public DataSource getDataSource() {
       BasicDataSource dataSource = new BasicDataSource();
       dataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
       dataSource.setUrl(env.getProperty("jdbc.url"));
       dataSource.setUsername(env.getProperty("jdbc.username"));
       dataSource.setPassword(env.getProperty("jdbc.password"));
       return dataSource;
    }
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
       LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
       factoryBean.setDataSource(getDataSource());
       
       Properties props=new Properties();
       props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
       props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
       props.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
       props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));

       factoryBean.setHibernateProperties(props);
       factoryBean.setAnnotatedClasses(Consumerentity.class);
       factoryBean.setAnnotatedClasses(Productentity.class);
       return factoryBean;
    }
    
    
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean emf() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(getDataSource());
        emf.setPackagesToScan(new String[] {"com.consumerproductapp"});
        emf.setJpaVendorAdapter(
        new HibernateJpaVendorAdapter());
        return emf;
   }
    
    @Autowired
    EntityManagerFactory emf;
    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager tm = new JpaTransactionManager();
        tm.setEntityManagerFactory(emf);
        tm.setDataSource(getDataSource());
        return tm;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
       HibernateTransactionManager transactionManager = new HibernateTransactionManager();
       transactionManager.setSessionFactory(getSessionFactory().getObject());
       return transactionManager;
    }
}
