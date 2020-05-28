package Student.demo.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pojoClasses.Course;
import pojoClasses.Instructor;
import pojoClasses.InstructorDetail;
import pojoClasses.Student;

public class CreateStudentAndCourseDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class).
                        addAnnotatedClass(InstructorDetail.class).
                        addAnnotatedClass(Course.class).
                        addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            // begin the transaction
            session.beginTransaction();

            // create a course
            Course theCourse = new Course("Basic java programming");

            // save the course
            session.save(theCourse);

            // print the course
            System.out.println("the course is  " +theCourse);

            // create the student
            Student student = new Student("Anju", "majoka", "anjummm.com");
            Student student1 = new Student("Nisha", "rani", "nisahrani.com");

            // adding the student in the course
            theCourse.addStudent(student);
            theCourse.addStudent(student1);

            // save the student
            System.out.println("saving the student");
            session.save(student);
            session.save(student1);

            System.out.println("saving student is complete");
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
