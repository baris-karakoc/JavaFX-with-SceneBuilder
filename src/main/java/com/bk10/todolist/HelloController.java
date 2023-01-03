package com.bk10.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
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
        taskList.getItems().add(inputTask.getText());
    }

    @FXML
    void inputTask(ActionEvent event) {

    }

}
