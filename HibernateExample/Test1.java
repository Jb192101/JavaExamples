package org.jedi_bachelor.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jedi_bachelor.task.hibernate_test.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        // Сначала создаём сессию (его можно потом переиспользовать)
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // Сессия живёт недолго
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Имя", "Фамилия", "IT", 500);

            session.beginTransaction(); // открытие транзакции
            session.persist(employee); // сохранение объекта в сессию (раньше был метод save())
            session.getTransaction().commit(); // закрытие транзакции
        } finally {
            factory.close();
        }
    }
}
