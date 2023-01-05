package com.bk10.todolist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TableView<FileData> tableTaskList;

    @FXML
    private TableColumn<FileData, String> taskDateList;

    @FXML
    private TableColumn<FileData, String> taskDescriptions;

    @FXML
    private TableColumn<FileData, String> taskList;

    @FXML
    private VBox tsk;

    @FXML
    void addTask(ActionEvent event) {
        taskList.setCellValueFactory(new PropertyValueFactory<FileData, String>("task"));
        taskDescriptions.setCellValueFactory(new PropertyValueFactory<FileData, String>("taskDescriptions"));
        taskDateList.setCellValueFactory(new PropertyValueFactory<FileData, String>("taskDate"));

        // ObservableList<FileData> observableList = FXCollections.observableArrayList(
        // new FileData("görev","görev açıklaması", "tarih")
        // );
        // tableTaskList.setItems(observableList);

        if (inputTask.getText().isBlank() || inputTaskDescription.getText().isBlank()
                || inputDate.getText().isBlank()) {
            inputTask.setPromptText("Lütfen geçerli bir görev giriniz.");
            inputTaskDescription.setPromptText("Lütfen geçerli bir görev açıklaması giriniz.");
            inputDate.setPromptText("Lütfen geçerli bir tarih giriniz.");
        } else {
            FileData fileData = new FileData(inputTask.getText(), inputTaskDescription.getText(), inputDate.getText());
            tableTaskList.getItems().add(fileData);
            inputTask.clear();
            inputTaskDescription.clear();
            inputDate.clear();
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

        FileData selectedTask = tableTaskList.getSelectionModel().getSelectedItem();
        if (selectedTask == null) {
        System.out.println("Lütfen önce bir görev seçin.");
        return;
        }
        int index = tableTaskList.getSelectionModel().getSelectedIndex();
        selectedTask.setTask("✓ " + selectedTask.getTask());
        tableTaskList.getItems().set(index, selectedTask);
    }

    // FileData selectedTask = tableTaskList.getSelectionModel().getSelectedItem();
    // int index = tableTaskList.getSelectionModel().getSelectedIndex();
    // tableTaskList.getItems().set(index,"+" + selectedTask);

}
