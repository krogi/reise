module com.mycompany.informatiktechnik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.informatiktechnik to javafx.fxml;
    exports com.mycompany.informatiktechnik;
}
