package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Course;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;
import pojoClasses.Review;

public class CreateCourseAndReviewDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        addAnnotatedClass(Course.class).addAnnotatedClass(Review.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

            // create new course
            Course course = new Course("Pack man course");

            course.addReview(new Review("Great course, done it"));
            course.addReview(new Review("Cool course, very good"));
            course.addReview(new Review("what a dumb course. your an idiot!"));

            // save the course
            System.out.println("im saving the course");
            System.out.println(course);
            System.out.println(course.getReviews());

            session.save(course);

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
