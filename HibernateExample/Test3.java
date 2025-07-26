package org.jedi_bachelor.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jedi_bachelor.task.hibernate_test.entity.Employee;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        // Сначала создаём сессию (его можно потом переиспользовать)
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // Сессия живёт недолго
            Session session = factory.getCurrentSession();

            session.beginTransaction(); // открытие транзакции

            //List<Employee> emps = session.createQuery("from Employee").getResultList();

            List<Employee> emps = session.createQuery("from Employee where name ='Имя'").getResultList();

            for(Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
