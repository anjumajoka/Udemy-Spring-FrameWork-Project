package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentQueryMain {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            // DELETE
            int studentId = 1;

            // retrieve the student we want to delete
            Student theStudent = session.get(Student.class, studentId);

            // perform  delete operation
            session.delete(theStudent);

            session.createQuery("delete from Student where firstName = 'Manish'");

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
