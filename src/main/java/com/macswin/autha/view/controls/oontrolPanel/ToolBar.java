package com.macswin.autha.view.controls.oontrolPanel;

import javafx.scene.control.Control;
import javafx.scene.control.Skin;

public class ToolBar extends Control {


    @Override
    protected Skin<?> createDefaultSkin() {
        return new ToolBarSkin(this);
    }
}
