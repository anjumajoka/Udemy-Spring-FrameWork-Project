package Student.demo.Main;

import org.hibernate.engine.jdbc.connections.internal.DriverConnectionCreator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTestMain {
    public static void main(String[] args){
        String jdbcUrl = "jdbc:mysql://localhost:3306/hb-04-one-to-many-uni?useSSL=false";
        String user = "hbstudent";
        String pass = "hbstudent";

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.printf("connection successful ");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
