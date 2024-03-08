module com.diper.devhelper {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.diper.devhelper to javafx.fxml;
    exports com.diper.devhelper;
}
