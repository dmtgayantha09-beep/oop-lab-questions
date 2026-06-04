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
    
    public void findStudentById(int studentId) {

    String sql =
    "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";

    try {

        Connection con =
                StudentDatabaseConnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, studentId);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println(
                rs.getInt("student_id")
                + " "
                + rs.getString("student_name")
                + " "
                + rs.getInt("mark"));
        }
        else {
            System.out.println("Student not found.");
        }

    }
    catch(SQLException e) {
        System.out.println("Database Error");
    }
    }
    
    public void updateStudentMark(
        int studentId,
        int newMark) {

    String sql =
    "UPDATE students SET mark=? WHERE student_id=?";

    try {

        Connection con =
                StudentDatabaseConnection.getConnection();

        PreparedStatement ps =
                con.prepareStatement(sql);

        ps.setInt(1, newMark);
        ps.setInt(2, studentId);

        int rowsUpdated =
                ps.executeUpdate();

        if(rowsUpdated > 0) {
            System.out.println(
                    "Student mark updated successfully.");
        }
        else {
            System.out.println(
                    "Student not found. Mark not updated.");
        }

    }
    catch(SQLException e) {
        System.out.println("Database Error");
    }
    }
}