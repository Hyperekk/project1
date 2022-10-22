module com.bartt.liczby {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.bartt.liczby to javafx.fxml;
    exports com.bartt.liczby;
}