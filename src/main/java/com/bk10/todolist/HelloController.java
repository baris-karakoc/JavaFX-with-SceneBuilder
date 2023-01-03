package com.bk10.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private TextField inputTask;

    @FXML
    private ListView<String> taskList;

    @FXML
    private VBox tsk;

    @FXML
    private Label welcomeText;

    @FXML
    void addTask(ActionEvent event) {
        if (inputTask.getText().isBlank()) {
            inputTask.setPromptText("Lütfen geçerli bir görev giriniz.");
        } else {
            taskList.getItems().add(inputTask.getText());
            inputTask.clear();
            // inputTask.setPromptText("Enter a Task!");
        }

    }
    // Error Alert:
    // @FXML
    // void addTask(ActionEvent event) {
    //     if (inputTask.getText().isBlank()) {
    //         Alert alert = new Alert(AlertType.WARNING);
    //         alert.setTitle("Uyarı");
    //         alert.setHeaderText("Boş görev girdiniz");
    //         alert.setContentText("Lütfen geçerli bir görev giriniz.");
    //         alert.showAndWait();
    //     } else {
    //         taskList.getItems().add(inputTask.getText());
    //     }
    // }

    @FXML
    void deleteTask(ActionEvent event) {
        int selectedId = taskList.getSelectionModel().getSelectedIndex();
        taskList.getItems().remove(selectedId);
    }

    @FXML
    void inputTask(ActionEvent event) {

    }

    @FXML
    void markAsCompleted(ActionEvent event) {
        String selectedTask = taskList.getSelectionModel().getSelectedItem();
        if(selectedTask == null) {
            System.out.println("Lütfen önce bir görev seçin.");
            return;
        }
        int index = taskList.getSelectionModel().getSelectedIndex();
        taskList.getItems().set(index, "✓ " + selectedTask);
    }

    @FXML
    void date(ActionEvent event) {

    }

}
