module com.example.groupcode {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.groupcode to javafx.fxml;
    exports com.example.groupcode;
}