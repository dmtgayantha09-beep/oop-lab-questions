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
}