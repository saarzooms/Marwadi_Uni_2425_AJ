package com.allysoftsolutions.connection;

import java.sql.*;

public class MyConn {
    public static MyConn connObj;
    Connection connection;
    private MyConn(){

    }
    public static MyConn getInstance(){
        if(connObj==null)
            connObj = new MyConn();
        return connObj;
    }
    public void createConnction(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu_2425_test","root","");

        } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
        }
    }
    public String validateUser(String unm, String pwd){
        createConnction();
        String result = "No user found";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user_tbl where username = '"+unm+"' and pwd='"+pwd+"'");
            if(rs.next()){
                result = rs.getString("fullname");
            }
            stmt.close();
            closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
