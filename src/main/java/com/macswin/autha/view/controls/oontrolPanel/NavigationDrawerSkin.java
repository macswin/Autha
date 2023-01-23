package com.macswin.autha.view.controls.oontrolPanel;



import com.macswin.autha.view.controls.util.Viewable;
import javafx.beans.binding.Bindings;
import javafx.collections.ListChangeListener;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.*;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class NavigationDrawerSkin extends SkinBase<NavigationDrawer> implements Viewable {


    private NavigationDrawer navigationDrawer;
    private VBox menuContainer;
    private VBox drawerBox;
    private StackPane topContainer;
    private ScrollPane menuScroll;

    public NavigationDrawerSkin(NavigationDrawer navigationDrawer) {
        super(navigationDrawer);
        this.navigationDrawer = navigationDrawer;
        init();
        buildMenu();
    }


    @Override
    public void initializeParts() {

        drawerBox = new VBox();
        drawerBox.getStyleClass().add("drawer-box");
        menuContainer = new VBox();
        menuContainer.getStyleClass().add("menu-container");
        topContainer = new StackPane();
        topContainer.setPrefHeight(100);
        topContainer.getStyleClass().add("logo");
        menuScroll = new ScrollPane();
        menuScroll.setId("navigation-scroll");

    }



    private void buildMenu()
    {
        menuContainer.getChildren().clear();
        for(MenuItem item: getSkinnable().getMenuItems())
        {
            if(item instanceof Menu)
            {
                menuContainer.getChildren().add(buildSubMenuItem(item));
            }else
            {
                menuContainer.getChildren().add(buildMenuItem(item));
            }
        }

    }

    private Button buildMenuItem(MenuItem item)
    {
        Button button = new Button();
        button.textProperty().bind(item.textProperty());
        button.graphicProperty().bind(item.graphicProperty());
        button.disableProperty().bind(item.disableProperty());
        button.getStyleClass().addAll(item.getStyleClass());
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        button.setAlignment(Pos.CENTER_LEFT);
        button.setOnAction(item.getOnAction());


        return button;
    }

    private MenuButton buildSubMenuItem(MenuItem item)
    {
        Menu menu = (Menu) item;
        MenuButton menuButton = new MenuButton();
        menuButton.setPopupSide(Side.RIGHT);
        menuButton.graphicProperty().bind(item.graphicProperty());
        menuButton.textProperty().bind(item.textProperty());
        menuButton.disableProperty().bind(item.disableProperty());
        menuButton.getStyleClass().addAll(menu.getStyleClass());
        menuButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Bindings.bindContent(menuButton.getItems(), ((Menu) item).getItems());

        return menuButton;
    }


    @Override
    public void layoutParts() {

        drawerBox.setPrefWidth(40);
        drawerBox.setMinWidth(50);
        drawerBox.setMaxWidth(300);


        menuContainer.setFillWidth(true);
        menuScroll.setFitToHeight(true);
        menuScroll.setFitToWidth(true);
        menuScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        VBox.setVgrow(menuContainer, Priority.ALWAYS);
        VBox.setVgrow(menuScroll, Priority.ALWAYS);
        VBox.setVgrow(drawerBox, Priority.ALWAYS);

        menuScroll.setContent(menuContainer);

        drawerBox.getChildren().addAll(topContainer, menuScroll);
        getChildren().add(drawerBox);

    }

    @Override
    public void setupBindings() {

        navigationDrawer.getMenuItems().addListener((ListChangeListener<MenuItem>) change -> buildMenu());

    }


}
