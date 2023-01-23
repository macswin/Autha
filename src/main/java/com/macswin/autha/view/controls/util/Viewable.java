package com.macswin.autha.view.controls.util;

public interface Viewable {


    default void init()
    {
        initializeParts();
        layoutParts();
        setupBindings();

    }
    void initializeParts();

    void layoutParts();

    void setupBindings();

}
