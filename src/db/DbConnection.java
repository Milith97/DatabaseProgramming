package db;

public class DbConnection {

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Dbconnection {
        private static Dbconnection dbconnection=null;
        private Connection connection;

        private Dbconnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ijse","root","1234");
        }

        public static Dbconnection getInstance() throws SQLException, ClassNotFoundException {
            if (dbconnection==null){
                dbconnection = new Dbconnection();
            }
            return dbconnection;
        }

        public Connection getConnection() {
            return connection;
        }
    }
}
