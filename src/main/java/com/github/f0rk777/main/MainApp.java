package com.github.f0rk777.main;

import com.github.f0rk777.model.URShift;
import com.github.f0rk777.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 23.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        URShift urshift = (URShift) applicationContext.getBean("urshift");
        int i = -1;
        urshift.setI(i);


        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(urshift);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }

        System.out.println(Integer.toBinaryString(i));
        urshift.doUnsignedShift(i);

        long L = -1;
        System.out.println(Long.toBinaryString(L));
        urshift.doUnsignedShift(L);

        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        urshift.doUnsignedShift(s);

        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        urshift.doUnsignedShift(b);

        System.out.println(b >>> 10);


    }
}
