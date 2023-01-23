package com.macswin.autha.view.editor;


import com.macswin.autha.view.controls.oontrolPanel.ControlPanel;
import com.macswin.autha.view.controls.util.Viewable;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.StyleClassedTextArea;

public class TextEditorView extends BorderPane implements Viewable {

    private ControlPanel controlPanel;
    private StyleClassedTextArea area;
    private VirtualizedScrollPane<StyleClassedTextArea> vsPane;
    private VBox editorBox;
    private VBox structureBox;
    private VBox infoBox;
    private TreeView structure;
    private ToolBar editControls;
    private ToolBar structureControls;

    public TextEditorView(ControlPanel controlPanel)
    {
        this.controlPanel = controlPanel;
        init();
    }

    @Override
    public void initializeParts() {

        area = new StyleClassedTextArea();
        vsPane = new VirtualizedScrollPane<>(area);
        editorBox = new VBox();
        structureBox = new VBox();
        infoBox = new VBox();
        editControls = new ToolBar();
        structureControls = new ToolBar();
        structure = new TreeView();

        editorBox.getChildren().addAll(editControls, vsPane);
        structureBox.getChildren().addAll(structureControls, structure);
        this.setCenter(editorBox);
        this.setLeft(structureBox);
        this.setRight(infoBox);
    }

    @Override
    public void layoutParts() {


        VBox.setVgrow(infoBox, Priority.ALWAYS);
        VBox.setVgrow(editControls, Priority.ALWAYS);
        VBox.setVgrow(structureControls, Priority.ALWAYS);
        VBox.setVgrow(structure, Priority.ALWAYS);
        VBox.setVgrow(vsPane, Priority.ALWAYS);


    }

    @Override
    public void setupBindings() {

    }
}
