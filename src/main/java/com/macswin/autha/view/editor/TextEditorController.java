package com.macswin.autha.view.editor;


import com.macswin.autha.view.controls.oontrolPanel.ControlPanel;
import com.macswin.autha.view.controls.util.Controller;
import javafx.scene.layout.Region;

public class TextEditorController implements Controller {

    private TextEditorView view;


    public TextEditorController(ControlPanel controlPanel)
    {
        view = new TextEditorView(controlPanel);
        init();
    }

    @Override
    public void setupParts() {

    }

    @Override
    public void setupListeners() {

    }

    @Override
    public void setupBindings() {

    }

    @Override
    public void setupHandlers() {

    }

    @Override
    public Region getView() {
        return view;
    }
}
