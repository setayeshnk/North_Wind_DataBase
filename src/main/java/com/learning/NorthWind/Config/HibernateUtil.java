package com.learning.NorthWind.Config;
import com.learning.NorthWind.Entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "org.postgresql.Driver");
                settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/postgres");
                settings.put(Environment.USER, "postgres");
                settings.put(Environment.PASS, "123");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "Create");
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(Products.class);
                configuration.addAnnotatedClass(Suppliers.class);
                configuration.addAnnotatedClass(Categories.class);
                configuration.addAnnotatedClass(Region.class);
                configuration.addAnnotatedClass(Orders.class);
                configuration.addAnnotatedClass(OrderDetails.class);
                configuration.addAnnotatedClass(Employees.class);
                configuration.addAnnotatedClass(EmployeeTerritories.class);
                configuration.addAnnotatedClass(Territories.class);
                configuration.addAnnotatedClass(Customers.class);
                configuration.addAnnotatedClass(CustomerCustomerDemo.class);
                configuration.addAnnotatedClass(CustomerDemographics.class);
                configuration.addAnnotatedClass(Shippers.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}