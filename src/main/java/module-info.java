module edu.guilford {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.guilford to javafx.fxml;
    exports edu.guilford;
}
