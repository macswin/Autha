package com.macswin.autha.view.controls.oontrolPanel;


import com.dlsc.gemsfx.incubator.templatepane.TemplatePane;
import com.dlsc.gemsfx.incubator.templatepane.Tile;
import com.macswin.autha.view.controls.util.Viewable;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import org.kordamp.ikonli.Ikon;
import org.kordamp.ikonli.javafx.FontIcon;

public class ControlPanelView extends TemplatePane implements Viewable {


    private ControlPanel controlPanel;
    private Header header;
    private ContentController content;
    private NavigationDrawer navigationDrawer;
    private Tile navBox;


    public ControlPanelView(ControlPanel controlPanel, Header header, NavigationDrawer navigationDrawer, ContentController content)
    {
        this.controlPanel = controlPanel;
        this.header = header;
        this.navigationDrawer = navigationDrawer;
        this.content = content;
        init();
    }


    @Override
    public void initializeParts() {

        this.setPrefSize(1920, 1080);
        navBox = this.setNode(Position.LEFT, navigationDrawer);
        navBox.setTransition(Tile.TileTransition.SHRINK);
        this.setNode(Position.HEADER, header.getView());
        this.setNode(Position.CONTENT, content.getView());

    }

    public void slideDrawer()
    {
        System.out.println("Pressed");
        navBox.setVisible(!navBox.isVisible());

    }

    public Menu createMenuP(String name, Ikon ikon)
    {
        Menu menu = new Menu(name);
        FontIcon icon = new FontIcon(ikon);
        icon.setIconColor(Color.GRAY);
        icon.setIconSize(20);
        menu.getStyleClass().add("navigation-menu");
        menu.setGraphic(icon);
        menu.setDisable(false);


        return menu;
    }

    public MenuItem createMenuItemP(String label, Ikon ikon, EventHandler eventHandler)
    {
        MenuItem item = new MenuItem();
        FontIcon icon = new FontIcon(ikon);
        icon.setIconSize(20);
        icon.setIconColor(Color.GRAY);
        item.getStyleClass().add("navigation-item");
        item.setText("   " + label);
        item.setGraphic(icon);
        item.setDisable(false);
        item.setOnAction(eventHandler);
        return item;
    }


    @Override
    public void layoutParts() {

    }

    @Override
    public void setupBindings() {

    }

    public Region getView()
    {
        return this;
    }
}
