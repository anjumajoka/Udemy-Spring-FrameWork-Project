package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;

public class DeleteInstructorDetailDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            int id = 3;

            // begin the transaction
            session.beginTransaction();

            // get the object by id
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);

            // print the instructor detail by id
            System.out.printf("instructor detail"+instructorDetail);

            System.out.println("instructor" + instructorDetail.getInstructor());

            System.out.println("deleting instructor detail" + instructorDetail);

//            instructorDetail.getInstructor().setInstructorDetail(null);
            Instructor instructor = instructorDetail.getInstructor();
            instructor.setInstructorDetail(null);

           // delete the object
            session.delete(instructorDetail);

            // commit the transaction
            session.getTransaction().commit();

            // transaction is done!
            System.out.printf("Transaction is done");

        }catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            session.close();
            factory.close();
        }

    }
}
