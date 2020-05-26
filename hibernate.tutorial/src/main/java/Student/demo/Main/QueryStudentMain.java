package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentMain {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // start the transaction
            session.beginTransaction();

            // query the Student
            List<Student> theStudents = session.createQuery("from Student").list();

            // retrieve theStudent
            for (Student student : theStudents){
                System.out.printf(""+student);
            }

            // query student for : student last name = bhola
            theStudents = session.createQuery("from Student where lastName = 'bhola'").list();

            // print the student last name with bhola
            System.out.printf(""+theStudents);

            session.getTransaction().commit();

            // NEW CODE

            session = factory.getCurrentSession();

            session.beginTransaction();

            int studentId = 1;

            // retrieve the student of student id 1
            Student student1 = session.get(Student.class,studentId);

            // print the student
            System.out.printf(""+student1);

            // update the student of id 1
            student1.setFirstName("Uday");

            session.createQuery("update Student set email = 'foo@gmail.com'").executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
