package com.macswin.autha.view.controls.oontrolPanel;



import com.macswin.autha.view.controls.util.Viewable;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class HeaderSkin extends SkinBase<Header> implements Viewable {

    Header header;
    HBox container;
    HBox leftSide;
    HBox rightSide;

    public HeaderSkin(Header header)
    {

        super(header);
        this.header = header;
        init();
    }


    @Override
    public void initializeParts() {

        container = new HBox();
        leftSide = new HBox();
        rightSide = new HBox();

    }

    @Override
    public void layoutParts() {

        container.getStyleClass().add("header");
        container.setPrefHeight(60);
        container.setFillHeight(true);
        container.setSpacing(10);
        container.setPadding(new Insets(10));
        container.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(container, Priority.ALWAYS);
        HBox.setHgrow(leftSide, Priority.ALWAYS);
        HBox.setHgrow(rightSide, Priority.ALWAYS);

        leftSide.setAlignment(Pos.CENTER_LEFT);
        leftSide.setMaxWidth(Double.MAX_VALUE);
        leftSide.setSpacing(30);
        rightSide.setAlignment(Pos.CENTER_RIGHT);
        rightSide.setMaxWidth(Double.MAX_VALUE);


        container.getChildren().addAll(leftSide, rightSide);

        getChildren().add(container);
    }

    private void buildHeaderLeft()
    {
        leftSide.getChildren().clear();

        for(Node node: getSkinnable().getLeftSideItems())
        {
            leftSide.getChildren().add(node);
        }


    }

    private void buildHeaderRight()
    {
        rightSide.getChildren().clear();
        for(Node node: getSkinnable().getRideSideItems())
        {
            rightSide.getChildren().add(node);
        }
    }

    @Override
    public void setupBindings() {

        header.getLeftSideItems().addListener((ListChangeListener<Node>) change -> buildHeaderLeft());
        header.getRideSideItems().addListener((ListChangeListener<Node>) change -> buildHeaderRight());

    }

}
