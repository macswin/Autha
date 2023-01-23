package com.macswin.autha.view.controls.oontrolPanel;

import com.dlsc.gemsfx.incubator.templatepane.TemplatePane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Region;
import org.kordamp.ikonli.Ikon;

public class ControlPanel {


    private final ControlPanelView controlPanelView;
    private NavigationDrawer navigationDrawer;
    private final ContentController content;
    private Header header;

    private final ObservableList<MenuItem> navigationItems = FXCollections.observableArrayList();
    private final ObservableList<Node> headerLeftItem = FXCollections.observableArrayList();
    private final ObservableList<Node> headerRightItem = FXCollections.observableArrayList();


    public ControlPanel()
    {

        navigationDrawer = new NavigationDrawer(this);
        content = new ContentController(this);
        header = new Header(this);
        controlPanelView = new ControlPanelView(this, header, navigationDrawer, content);

    }

    public Menu createMenu(String name, Ikon ikon)
    {
        return controlPanelView.createMenuP(name, ikon);
    }


    public MenuItem createMenuItem(String label, Ikon ikon, EventHandler eventHandler)
    {
        return controlPanelView.createMenuItemP(label, ikon, eventHandler);
    }



    public void setNode(TemplatePane.Position pos, Node node)
    {
        controlPanelView.setNode(pos, node);
    }

    public void setContent(Node node){
        content.setContentView(node);
    }

    public void removeContent(Node node) {
        content.removeContentView(node);
    }

    public void showDrawer() {
        controlPanelView.slideDrawer();
    }

    public void showTopToolBar(boolean show) {}

    public void showBottomToolBar(boolean show) {}

    public Region getView()
    {
        return controlPanelView.getView();
    }

    public ObservableList<MenuItem> getNavigationItems() {
        return navigationItems;
    }

    public ObservableList<Node> getHeaderLeftItem() {
        return headerLeftItem;
    }

    public ObservableList<Node> getHeaderRightItem() {
        return headerRightItem;
    }
}
