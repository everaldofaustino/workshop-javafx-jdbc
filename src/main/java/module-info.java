module org.everaldo.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens org.everaldo.workshopjavafxjdbc to javafx.fxml;
    opens model.entities to javafx.base;
    exports org.everaldo.workshopjavafxjdbc;
}