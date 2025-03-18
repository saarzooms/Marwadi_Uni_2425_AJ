package org.example;

import java.sql.*;

public class PTest {
    public static void main(String[] args) {
        // delete from student; this will delete all rows
        //truncate student; //delete all data of table
        //drop then, recreate table

        // select * from user_tbl where username = ' abcand password = 'xyz'
//        String url = "jdbc:mysql://localhost:3306/mu_2425_test";
//        String dbUser = "root";
//        String dbPwd = "";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url,dbUser,dbPwd);
//            String query = "select * from user_tbl where username = ?";
//            PreparedStatement preparedStatement = connection.prepareStatement(query);
//            preparedStatement.setString(1,"arzoo");
//            ResultSet rs = preparedStatement.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString("username"));
//                System.out.println(rs.getString("fullname"));
//                System.out.println(rs.getString("pwd"));
//                System.out.println(rs.getInt("status"));
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
        fetchUsers("ar","ar");
        fetchUsers("ar",null);
        fetchUsers(null,"ar");
        fetchUsers(null,null);
    }
    static void fetchUsers(String username, String fullname) {
        String url = "jdbc:mysql://localhost:3306/mu_2425_test";
        String dbUser = "root";
        String dbPwd = "";
        Connection connection= null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,dbUser,dbPwd);
            String query = "select * from user_tbl";
            if(username!=null || fullname!=null){
                query += " where ";
            }
                if(username!=null){
                    query += "username like '%"+username+"%'";
                }
                if(username!=null && fullname!=null){
                    query += " and ";
                }
            if(fullname!=null){
                query += "fullname like  '%"+fullname+"%'";
            }
            System.out.println(query);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("fullname"));
                System.out.println(rs.getString("pwd"));
                System.out.println(rs.getInt("status"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection!=null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
