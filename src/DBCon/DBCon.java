package DBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBCon {
    Connection connection = null;
    ResultSet resultSet = null;
    Statement statement = null;

    public DBCon() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection()

        } catch () {

        }
    }
}
