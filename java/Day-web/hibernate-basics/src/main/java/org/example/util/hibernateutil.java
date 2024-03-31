package org.example.util;

//import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;


//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import javax.imageio.spi.ServiceRegistry;
//import org.hibernate.service.ServiceRegistry;

//import java.lang.module.Configuration;

import org.hibernate.SessionFactory;
//import java.lang.module.Configuration;
//import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class hibernateutil {
    private static SessionFactory sessionFactory;
    private static SessionFactory buildSessionFactory(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addResource("employee.hbm.xml");

        ServiceRegistry registry =  (ServiceRegistry)new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(registry);
        return sessionFactory;
    }

    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            sessionFactory = buildSessionFactory();
        }
        return sessionFactory;
    }
}
