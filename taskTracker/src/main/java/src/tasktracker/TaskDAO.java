/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.tasktracker;

/**
 *
 * @author Thilan
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskDAO {

    // Add a new task
    public void addTask(Task task) {
        String sql = "INSERT INTO tasks (task_id, task_title, status) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, task.getTaskId());
            statement.setString(2, task.getTaskTitle());
            statement.setString(3, task.getStatus());

            statement.executeUpdate();
            System.out.println("Task added successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Display all tasks
    public void displayAllTasks() {
        String sql = "SELECT task_id, task_title, status FROM tasks";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("task_id") + " "
                        + resultSet.getString("task_title") + " "
                        + resultSet.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Search a task by ID
    public Task searchTask(int id) {
        String sql = "SELECT * FROM tasks WHERE task_id = ?";
        Task task = null;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                task = new Task(rs.getInt("task_id"),
                                rs.getString("task_title"),
                                rs.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }

        return task;
    }

    // Update an existing task
    public void updateTask(Task task) {
        String sql = "UPDATE tasks SET task_title = ?, status = ? WHERE task_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, task.getTaskTitle());
            statement.setString(2, task.getStatus());
            statement.setInt(3, task.getTaskId());

            statement.executeUpdate();
            System.out.println("Task updated successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Delete a task
    public void deleteTask(int id) {
        String sql = "DELETE FROM tasks WHERE task_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Task deleted successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
