module com.example.soone {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.prefs;
    requires org.apache.commons.io;
    requires org.slf4j;


    opens com.example.soone;
    exports com.example.soone;
}