package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Course;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

public class EagerLazyDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        addAnnotatedClass(Course.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

           // get instructor
            int theId = 1;

            Instructor tempInstructor = session.get(Instructor.class, theId);

            System.out.println("print instructor  " +tempInstructor);

            System.out.println("print the course   " +tempInstructor.getCourses());

            // commit the transaction
            session.getTransaction().commit();

            // transaction is done!
            System.out.printf("Transaction is done");

        } finally {
            session.close();
            factory.close();
        }
    }
}