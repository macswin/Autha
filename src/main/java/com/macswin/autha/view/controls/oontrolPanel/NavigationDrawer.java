package com.macswin.autha.view.controls.oontrolPanel;

import javafx.collections.ObservableList;
import javafx.scene.control.Control;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Skin;

public class NavigationDrawer extends Control {

    private ControlPanel controlPanel;

    public  NavigationDrawer(ControlPanel controlPanel)
    {
        this.getStyleClass().add("navigation");
        this.controlPanel = controlPanel;

    }

    @Override
    protected Skin<?> createDefaultSkin() {
        return new NavigationDrawerSkin(this);
    }

    public ObservableList<MenuItem> getMenuItems() {
        return controlPanel.getNavigationItems();
    }


}
