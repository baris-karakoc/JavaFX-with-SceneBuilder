package com.bk10.todolist;

public class FileData {
    String task;
    String taskDescriptions;
    String taskDate;

    public FileData(String task, String taskDescriptions, String taskDate) {
        this.task = task;
        this.taskDescriptions = taskDescriptions;
        this.taskDate = taskDate;
    }

    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String getTaskDescriptions() {
        return taskDescriptions;
    }
    public void setTaskDescriptions(String taskDescriptions) {
        this.taskDescriptions = taskDescriptions;
    }
    public String getTaskDate() {
        return taskDate;
    }
    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }
}
