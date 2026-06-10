/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src.tasktracker;

/**
 *
 * @author Thilan
 */

/*
CREATE DATABASE taskdb;

USE taskdb;

CREATE TABLE tasks (
    task_id INT PRIMARY KEY,
    task_title VARCHAR(100) NOT NULL,
    status VARCHAR(20) NOT NULL
);

*/
public class Task {
    //attributes
    private int taskId;
    private String taskTitle;
    private String status;
    
    //constructor
    public Task(int taskId, String taskTitle, String status) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.status = status;
    }
    //getters
    public int getTaskId() { 
        return taskId; }
    public String getTaskTitle() { 
        return taskTitle; }
    public String getStatus() { 
        return status; }
}
