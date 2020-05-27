package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

import javax.persistence.criteria.CriteriaBuilder;

public class DeleteDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            int id = 1;

            // begin the transaction
            session.beginTransaction();

            // create the instructor object
            Instructor instructor = session.get(Instructor.class, id);

            // delete instructor
            //it will also delete instructor detail becoz of cascading
            session.delete(instructor);

            // commit the transaction
            session.getTransaction().commit();

            // transaction is done!
            System.out.printf("Transaction is done");

        } finally {
            factory.close();
        }

    }
}
