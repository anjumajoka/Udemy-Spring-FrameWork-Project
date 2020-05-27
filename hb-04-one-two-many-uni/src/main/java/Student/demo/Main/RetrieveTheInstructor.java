package Student.demo.Main;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Course;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

public class RetrieveTheInstructor {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

            int theId = 1;

            Instructor instructor = session.get(Instructor.class, theId);

            System.out.println("tttt   " + instructor);

            System.out.println("cccc   "+instructor.getCourses());

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
