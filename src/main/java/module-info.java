module com.macswin.autha {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.fxmisc.richtext;
    requires org.fxmisc.flowless;
    requires org.fxmisc.undo;
    requires javafx.graphics;
    requires org.kordamp.ikonli.fontawesome5;
    requires com.dlsc.gemsfx;
    requires org.kordamp.ikonli.core;
    requires MaterialFX;

    opens com.macswin.autha to javafx.fxml;
    exports com.macswin.autha;
}