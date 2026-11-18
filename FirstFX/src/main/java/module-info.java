module com.example.firstfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.firstfx to javafx.fxml;
    exports com.example.firstfx;
}