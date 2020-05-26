package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

public class GetInstructorDetailDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            int id = 2;

            // begin the transaction
            session.beginTransaction();

            // create the instructor object
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);

           // print the instructor detail by id
            System.out.printf("instructor detail"+instructorDetail);

            // print the instructor by instructor detail
            System.out.printf("instructor"+instructorDetail.getInstructor());

            // commit the transaction
            session.getTransaction().commit();

            // transaction is done!
            System.out.printf("Transaction is done");

        } finally {
            factory.close();
        }

    }
}
