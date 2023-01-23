package com.macswin.autha.view.controls.oontrolPanel;



import com.macswin.autha.view.controls.util.Controller;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.Region;

public class ContentController implements Controller {

    private ControlPanel controlPanel;
    private ContentView contentView;
    private ObservableList<Node> nodes;
    private Node activeView;


    public ContentController(ControlPanel controlPanel)
    {
        this.controlPanel = controlPanel;
        init();
    }

    @Override
    public void setupParts() {

        contentView = new ContentView();
        nodes = FXCollections.observableArrayList();
    }

    public void setContentView(Node node)
    {
        contentView.setContent(node);
        activeView = node;
    }

    public void removeContentView(Node node)
    {
        contentView.removeContent(node);
        activeView =  null;
    }

    public Node getActiveView()
    {
        return activeView;
    }

    public Region getView()
    {
        return contentView;
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
}
