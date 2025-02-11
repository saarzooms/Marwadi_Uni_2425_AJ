package org.example;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        login();
//        System.out.println(validateUser("abc","abc"));
//        System.out.println(validateUser("ab","abc"));
//        System.out.println(validateUser("ac","abc"));
//        System.out.println(validateUser("arzoo","arzoo"));
    }
    public static String validateUser(String uname, String pwd){
        String ret="No such user found";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mu_2425_test","root","");
            Statement statement = connection.createStatement();
            String query = "select fullname from user_tbl where username='"+uname+"' and pwd='"+pwd+"'";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
     ret = resultSet.getString("fullname");
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return ret;
    }
    public static void login(){
        Scanner sc= new Scanner(System.in);
        boolean isCancel = false;
        boolean validUser = false;
        while(!validUser & !isCancel){
            System.out.println("Enter username: ");
            String uname = sc.next();
            System.out.println("Enter password: ");
            String pwd = sc.next();
            String ret = validateUser(uname,pwd);
            if(ret.equals("No such user found")){
                System.out.println(ret+" if you want to try again yes/no");
                String choice = sc.next();
                if(choice.equals("No")||choice.equals("no")){
                    isCancel= true;
                    System.out.println("bye from this");
                }
            }else{
                validUser= true;
                System.out.println("Welcome, "+ret);
            }
        }
    }
}
