/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab08;

/**
 *
 * @author Thilan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {

    public void addStudent(Student student) {

        String sql =
        "INSERT INTO students(student_id, student_name, mark) VALUES(?,?,?)";

        try {
            Connection con =
                    StudentDatabaseConnection.getConnection();

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getStudentName());
            ps.setInt(3, student.getMark());

            ps.executeUpdate();

            System.out.println(
                    "Student added successfully.");
        }
        catch(SQLException e) {
            System.out.println("Database Error");
        }
    }
    
    public void displayAllStudents() {

    String sql =
    "SELECT student_id, student_name, mark FROM students";

    try {

        Connection con =
                StudentDatabaseConnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            System.out.println(
                rs.getInt("student_id")
                + " "
                + rs.getString("student_name")
                + " "
                + rs.getInt("mark"));
        }

    }
    catch(SQLException e) {
        System.out.println("Database Error");
        }
    }
    
}