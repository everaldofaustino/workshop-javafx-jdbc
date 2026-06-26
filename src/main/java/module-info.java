module org.everaldo.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.everaldo.workshopjavafxjdbc to javafx.fxml;
    exports org.everaldo.workshopjavafxjdbc;
}