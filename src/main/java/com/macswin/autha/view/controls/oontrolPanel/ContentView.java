package com.macswin.autha.view.controls.oontrolPanel;



import com.macswin.autha.view.controls.util.Viewable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

public class ContentView extends StackPane implements Viewable {



    public ContentView()
    {
        this.setAlignment(Pos.CENTER);
        init();
    }

    protected void setContent(Node node)
    {
        this.getChildren().clear();

       if(!this.getChildren().contains(node))
        {
            this.getChildren().add(node);
        }
    }

    protected void removeContent(Node node)
    {
            this.getChildren().remove(node);

    }




    @Override
    public void initializeParts() {

        this.setAlignment(Pos.CENTER);

    }

    @Override
    public void layoutParts() {

    }

    @Override
    public void setupBindings() {

    }

}
