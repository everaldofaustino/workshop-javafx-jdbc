module org.everaldo.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens org.everaldo.workshopjavafxjdbc to javafx.fxml;
    exports org.everaldo.workshopjavafxjdbc;
}