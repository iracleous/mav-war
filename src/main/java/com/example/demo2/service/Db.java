package com.example.demo2.service;

import java.sql.*;
import java.util.Properties;

public class Db  {

    public String getValueFromDb(int id)   {
        String dbURL="jdbc:mysql://localhost:3306/advdb", user="root", pwd="passw0rd";
        //String dbURL = "jdbc:postgresql://localhost/test";
        //String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
        String returnValue = "";
        try {
          //  Connection conn = DriverManager.getConnection(dbURL, user, pwd);

            Properties props = new Properties();
            props.setProperty("user",user);
            props.setProperty("password",pwd);

            Connection conn = DriverManager.getConnection(dbURL, props);





            String query = "SELECT * FROM Instructor where id= ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                returnValue += resultSet.getString("name") ;
            }
            resultSet.close();
            conn.close();


        } catch (SQLException e) {
            returnValue = "-1";
        }
        return returnValue;
    }

}
