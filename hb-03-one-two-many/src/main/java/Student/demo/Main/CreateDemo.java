package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

public class CreateDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

            // create the instructor object
            Instructor instructor = new Instructor("Anju", "Majoka", "anjummm@moj.com");

            // create the instructor detail object
            InstructorDetail instructorDetail = new InstructorDetail("http://www.anjumajoka", "loveTocode");
             /*


            // create the instructor object
            Instructor instructor = new Instructor("Shachi", "Shah", "shachishh@Shah.com");

            // create the instructor detail object
            InstructorDetail instructorDetail = new InstructorDetail("http://www.ShachiShah", "loveToCook");

             */

            // associate the objects
            instructor.setInstructorDetail(instructorDetail);

            // save the object
            session.save(instructor);

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