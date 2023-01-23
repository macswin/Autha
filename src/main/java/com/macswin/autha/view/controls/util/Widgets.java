package com.macswin.autha.view.controls.util;

import com.dlsc.gemsfx.TimePicker;
import io.github.palexdev.materialfx.controls.MFXCheckbox;
import io.github.palexdev.materialfx.controls.MFXDatePicker;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.time.LocalTime;

public class Widgets {

    public static Node createInputField(StringProperty binding)
    {
        TextField node = new TextField();
        node.getStyleClass().add("input-field");
        node.textProperty().bindBidirectional(binding);
        HBox.setHgrow(node, Priority.ALWAYS);
        return node;
    }

    public static TextField createInputFieldAlt(StringProperty binding)
    {
        TextField node = new TextField();
        node.getStyleClass().add("input-field");
        node.textProperty().bindBidirectional(binding);
        HBox.setHgrow(node, Priority.ALWAYS);
        return node;
    }

    public static Node createPromptText(String prompt) {
        Text results = new Text(prompt);
        results.getStyleClass().add("label-text");
        return results;
    }

    public static Node createTitleText(String prompt) {
        Label results = new Label(prompt);
        results.getStyleClass().add("title-text");
        results.setPadding(new Insets(20));
        return results;
    }

    public static Node createTextArea(StringProperty binding)
    {
        TextArea results =  new TextArea();
        results.getStyleClass().add("text-box");
        results.textProperty().bindBidirectional(binding);
        results.setWrapText(true);
        HBox.setHgrow(results, Priority.ALWAYS);
        results.setMaxWidth(Double.MAX_VALUE);
        return results;
    }

    public static Node createTitleHBox(int spacing, Node...nodes)
    {
        HBox results = new HBox();
        results.getStyleClass().add("title-box");
        results.getChildren().addAll(nodes);
        results.setSpacing(spacing);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static VBox createDataVBox(Node...nodes)
    {
        VBox results = new VBox();
        results.getStyleClass().add("data-box");
        results.getChildren().addAll(nodes);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static Node createComboBox(ObservableList items)
    {
        ComboBox results = new ComboBox();
        results.getStyleClass().add("combo-data-box");
        results.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(results, Priority.ALWAYS);
        results.setItems(items);
        return results;
    }

    public static Node createCheckBox(BooleanProperty binding)
    {
        MFXCheckbox results = new MFXCheckbox();
        results.getStyleClass().add("check-box");
        results.selectedProperty().bindBidirectional(binding);
        return results;
    }

    public static MFXCheckbox createMFXCheckBox(BooleanProperty binding)
    {
        MFXCheckbox results = new MFXCheckbox();
        results.getStyleClass().add("check-box");
        results.selectedProperty().bindBidirectional(binding);
        return results;
    }

    public static Node createDatePicker(StringProperty binding)
    {
        MFXDatePicker results =  new MFXDatePicker();
        results.getStyleClass().add("date-box");
        results.textProperty().bindBidirectional(binding);
        results.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static MFXDatePicker createMFXDatePicker(StringProperty binding)
    {
        MFXDatePicker results =  new MFXDatePicker();
        results.getStyleClass().add("date-box");
        results.textProperty().bindBidirectional(binding);
        results.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static Node createTimePicker(ObjectProperty<LocalTime> binding )
    {
        TimePicker results = new TimePicker();
        results.getStyleClass().add("time-box");
        results.timeProperty().bindBidirectional(binding);
        results.setMaxWidth(Double.MAX_VALUE);
        results.setMinHeight(30);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static TimePicker createTimePickerAlt(ObjectProperty<LocalTime> binding )
    {
        TimePicker results = new TimePicker();
        results.getStyleClass().add("time-box");
        results.timeProperty().bindBidirectional(binding);
        results.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }


    public static GridPane createTwoColumnGridPane() {
        GridPane results = new GridPane();

        results.getColumnConstraints().addAll(createJustifiedConstraint(HPos.RIGHT), createJustifiedConstraint(HPos.LEFT));
        results.setHgap(20);
        results.setVgap(10);
        results.setPadding(new Insets(4));
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }


    public static GridPane createThreeColumnGridPane() {
        GridPane results = new GridPane();

        results.getColumnConstraints().addAll(createJustifiedSpacedConstraint(HPos.LEFT, 120), createJustifiedConstraint(HPos.LEFT), createJustifiedSpacedConstraint(HPos.CENTER, 40));
        results.setHgap(20);
        results.setVgap(10);
        results.setPadding(new Insets(15));
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    public static GridPane createThreeColumnAltGridPane() {
        GridPane results = new GridPane();
        results.getColumnConstraints().addAll(createJustifiedSpacedConstraint(HPos.LEFT, 120), createJustifiedConstraint(HPos.LEFT), createJustifiedConstraint(HPos.LEFT), createJustifiedSpacedConstraint(HPos.CENTER, 40));
        results.setHgap(20);
        results.setVgap(10);
        results.setPadding(new Insets(15));
        HBox.setHgrow(results, Priority.ALWAYS);
        return results;
    }

    private static RowConstraints createJustifiedRowConstraint()
    {
        RowConstraints results =  new RowConstraints();

        return results;
    }

    private static ColumnConstraints createJustifiedConstraint(HPos alignment) {
        ColumnConstraints results = new ColumnConstraints();
        results.setFillWidth(true);
        results.setHgrow(Priority.ALWAYS);
        results.setHalignment(alignment);
        return results;
    }

    private static ColumnConstraints createJustifiedSpacedConstraint(HPos alignment, double width) {
        ColumnConstraints results = new ColumnConstraints();
        results.setPrefWidth((width));
        results.setHalignment(alignment);
        return results;
    }
}
