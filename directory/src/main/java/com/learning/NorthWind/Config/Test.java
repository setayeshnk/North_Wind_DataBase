package com.learning.NorthWind.Config;

import com.learning.NorthWind.Entity.*;
import org.hibernate.Session;

import org.hibernate.Transaction;




public class Test {
    public static void main(String[] args) {

        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx=session.beginTransaction();
        session.save(Products.class);
        session.save(Suppliers.class);
        session.save(Categories.class);
        session.save(Region.class);
        session.save(Orders.class);
        session.save(OrderDetails.class);
        session.save(Employees.class);
        session.save(EmployeeTerritories.class);
        session.save(Territories.class);
        session.save(Customers.class);
        session.save(CustomerCustomerDemo.class);
        session.save(CustomerDemographics.class);
        session.save(Shippers.class);

        tx.commit();
        session.close();

    }

}
