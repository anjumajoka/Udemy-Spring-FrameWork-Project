package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            Student theStudent = new Student("anju","majoka","anjumajoka1@gmail.com");

            session.beginTransaction();

            session.save(theStudent);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}