package org.example;

import org.example.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "from User where userName = :uname and pwd=:pwd";
        Query query = session.createQuery(hql, User.class);
        query.setParameter("uname","Arzoo");
        query.setParameter("pwd","234");
        List users = query.getResultList();
        Iterator i = users.iterator();
        while(i.hasNext()){
            User u = (User)i.next();
            System.out.println(u.getUserName());
        }
        session.close();
        factory.close();
    }
}
