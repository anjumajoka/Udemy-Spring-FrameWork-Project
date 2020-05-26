package primerykey;

import Student.demo.Main.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyMain {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .configure("hb-one-two-one.hibernate.cfg.xml")
                .addAnnotatedClass(Student.class).buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            Student theStudent1 = new Student("Nisha","Bhola","nishabhola3@gmail.com");
            Student theStudent2 = new Student("Ridha","meena","ridhameena5@gmail.com");
            Student theStudent3 = new Student("Manish","kumar","manishkumar8@gmail.com");

            session.beginTransaction();

            session.save(theStudent1);
            session.save(theStudent2);
            session.save(theStudent3);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
