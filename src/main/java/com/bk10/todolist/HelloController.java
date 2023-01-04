package com.bk10.todolist;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private TextField inputDate;

    @FXML
    private TextField inputTask;

    @FXML
    private TextField inputTaskDescription;

    @FXML
    private Label logo;

    @FXML
    private TableView<String> tableTaskList;

    @FXML
    private TableColumn<TextField, String> taskDateList;
    
    @FXML
    private TableColumn<TextField, String> taskDescriptions;

    @FXML
    private TableColumn<TextField, String> taskList;

    @FXML
    private VBox tsk;

    @FXML
    void addTask(ActionEvent event) {
        if (inputTask.getText().isBlank()) {
            inputTask.setPromptText("Lütfen geçerli bir görev giriniz.");
        } else {
            tableTaskList.getItems().add(inputTask.getText());
            inputTask.clear();
            
        }
    }

    @FXML
    void deleteTask(ActionEvent event) {
        int selectedId = tableTaskList.getSelectionModel().getSelectedIndex();
        tableTaskList.getItems().remove(selectedId);
    }

    @FXML
    void inputDate(ActionEvent event) {

    }

    @FXML
    void inputTask(ActionEvent event) {

    }

    @FXML
    void inputTaskDescriptions(ActionEvent event) {

    }

    @FXML
    void markAsCompleted(ActionEvent event) {
        String selectedTask = tableTaskList.getSelectionModel().getSelectedItem();
        if(selectedTask == null) {
            System.out.println("Lütfen önce bir görev seçin.");
            return;
        }
        int index = tableTaskList.getSelectionModel().getSelectedIndex();
        tableTaskList.getItems().set(index, "✓ " + selectedTask);
    }

}
