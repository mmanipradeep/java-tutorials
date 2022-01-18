package com.mani.db;

import org.h2.tools.RunScript;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection {
    private static final Logger logger = Logger.getLogger(MySQLConnection.class.getName());

    static {
        try {
            initializeDatabase(getConnectionToDatabase());
        } catch (FileNotFoundException exception) {
            logger.log(Level.SEVERE, "Could not find the .sql file", exception);
        } catch (SQLException exception) {
            logger.log(Level.SEVERE, "SQL error", exception);
        }
    }

    public static Connection getConnectionToDatabase() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testing", "root", "Lucas@123");

        } catch (Exception exception) {
            logger.log(Level.SEVERE, "Could not set up connection", exception);
        }
        logger.info("Connection set up completed");
        return connection;
    }
    public static void initializeDatabase(Connection conn) throws FileNotFoundException, SQLException {
        InputStream resource = MySQLConnection.class.getClassLoader().getResourceAsStream("initialize.sql");
        RunScript.execute(conn, new InputStreamReader(resource));
    }
}
