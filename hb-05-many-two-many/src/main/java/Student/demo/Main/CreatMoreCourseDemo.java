package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Course;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;
import pojoClasses.Student;

public class CreatMoreCourseDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        addAnnotatedClass(Course.class).
                        addAnnotatedClass(Student.class).
                        buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

            int theId = 2;

            Student theStudent = session.get(Student.class, theId);

            // create a course
            Course theCourse1 = new Course("Play Boy game plan");
            Course theCourse2 = new Course("Spring Boot Mvc frame work");

            theCourse1.addStudent(theStudent);
            theCourse2.addStudent(theStudent);

            System.out.println("saved the course of student id 2");

            session.save(theCourse1);
            session.save(theCourse2);

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
