package com.macswin.autha;


import com.macswin.autha.view.controls.oontrolPanel.ControlPanel;
import com.macswin.autha.view.editor.TextEditorController;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Region;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;

public class Autha{

    private ControlPanel controlPanel;

    public Autha()
    {
        controlPanel =  new ControlPanel();
        init();

    }



    private void init()
    {
        initHeader();
        initMenu();
    }

    private void initMenu()
    {
        MenuItem temp = controlPanel.createMenuItem("", FontAwesomeSolid.BOOK, event -> controlPanel.setContent(new TextEditorController(controlPanel).getView()));

        controlPanel.getNavigationItems().addAll(temp);
    }

    private void initHeader()
    {

    }



    public Region getView()
    {
        return controlPanel.getView();
    }

}
