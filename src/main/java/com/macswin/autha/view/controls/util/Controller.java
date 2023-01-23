package com.macswin.autha.view.controls.util;

import javafx.scene.layout.Region;

public interface Controller {


    default void init(){
        setupParts();
        setupListeners();
        setupHandlers();
        setupBindings();
    }

    void setupParts();

    void setupListeners();

    void setupBindings();

    void setupHandlers();

    Region getView();
}
