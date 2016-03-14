/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negocio.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({"com.negocio.config"})
@PropertySource(value= {"classpath:application.properties"})
public class HibernateConfig {
    //mapeo de la instancia declaracion del entorno
    @Autowired(required=true)
    private Environment environment;
    
    //mapeo del bean de spring
    //crea la sesion con la capa de modelo de hibernate 4
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean sessionFactoryBean= new LocalSessionFactoryBean();
        //seteo de el datasource
        sessionFactoryBean.setDataSource(dataSource());
        //se indica el package a escanear
        sessionFactoryBean.setPackagesToScan(new String[]{"com.negocio.model"});
        //propiedades de hibernate
        sessionFactoryBean.setHibernateProperties(hibernateProperties());
        return sessionFactoryBean;
    }

    //creacion del data source que se guarda en application.properties
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource= new DriverManagerDataSource();
        /*
        *en estas lines se agregan las configuraciones del driver de base de datos
        *la que se extraen desde un archivo de configuracion application.properties
        */
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    private Properties hibernateProperties() {
        //propiedades de hibernate igualmente desde application.properties
        Properties properties= new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        return properties;
    }
    
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s){
        HibernateTransactionManager txManager= new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
}
