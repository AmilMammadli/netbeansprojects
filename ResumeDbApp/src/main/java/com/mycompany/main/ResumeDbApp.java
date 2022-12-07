/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.main;

import com.mycompany.bean.User;
import com.mycompany.dao.impl.UserDaoImpl;
import com.mycompany.main.dao.inter.UserDaoInter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author amila
 */
public class ResumeDbApp {

    public static void main(String[] args) throws Exception {
//        UserDaoInter userdao = new UserDaoImpl();
//        List<User> list = userdao.getAll();
//        System.out.println(list);
       // connect();
        updateUser(); 
        getAllUser();
    }

    public static Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "123456789";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }

    public static void getAllUser() throws Exception {
        Connection c = connect();
        Statement stmt = c.createStatement();
        stmt.execute("select * from user");
        ResultSet rs = stmt.getResultSet();

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String email = rs.getString("email");
            String phone = rs.getString("phone");

            System.out.println("id: " + id);
            System.out.println("name: " + name);
            System.out.println("surname: " + surname);
            System.out.println("email: " + email);
            System.out.println("phone: " + phone);

            System.out.println("==============================");

        }
    }

    public static void updateUser() throws Exception {
        Connection c = connect();
        Statement stmt = c.createStatement();
        stmt.execute("UPDATE user SET `name`=\"amil\" WHERE id = 1;");

    }
}
