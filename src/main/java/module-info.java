module com.bk10.todolist {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.bk10.todolist to javafx.fxml;
    exports com.bk10.todolist;
}