package com.example.demo1ee;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentModel {
    public boolean save(StudentTo student) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(student);
            transaction.commit();
            return true;
        }catch(Exception e){
            System.out.println(e);
            transaction.rollback();
            return false;
        }finally {
            session.close();
        }
    }

}
