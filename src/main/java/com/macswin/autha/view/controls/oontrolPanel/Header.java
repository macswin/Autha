package com.macswin.autha.view.controls.oontrolPanel;


import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;
import javafx.scene.layout.Region;

public class Header extends Control {

    private ControlPanel controlPanel;


    public Header(ControlPanel controlPanel)
    {
        this.controlPanel = controlPanel;

    }

    @Override
    protected Skin<?> createDefaultSkin() {
        return new HeaderSkin(this);
    }

    public ObservableList<Node> getLeftSideItems() {
        return controlPanel.getHeaderLeftItem();
    }

    public ObservableList<Node> getRideSideItems() {
        return controlPanel.getHeaderRightItem();
    }


    public Region getView() {
        return this;
    }
}
