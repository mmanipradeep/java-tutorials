package com.mani.db;

import com.mani.model.Tenant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TenantDao {

    private static final Logger logger = Logger.getLogger(TenantDao.class.getName());

    public Tenant getDetails(String username){
        Tenant user = new Tenant();

        try{
            Connection connection = MySQLConnection.getConnectionToDatabase();
            PreparedStatement preparedStatement = connection
                    .prepareStatement("select * from tenant where id=?");
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                user.setId(resultSet.getInt("id"));
               // user.setUsername(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setAadhaarCard(resultSet.getString("aadhaarCard"));
                user.setGender(resultSet.getString("gender"));
            }
        } catch (SQLException exception) {
            logger.log(Level.SEVERE, "Could not execute query", exception);
        }
        return user;
    }
}
