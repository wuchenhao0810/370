package com.example.groupcode;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class View extends StackPane implements ModelSubscriber{
    private Model model;
    //named database as model
    private ViewPage currentPage;
    private mainView mainView;
    private locationView locationView;
    private inventoryView inventoryView;

    public View(){
        mainView = new mainView();
        this.getChildren().add(mainView);
    }



    public void setMainController(Controller controller){
        mainView.setController(controller);
    }

    @Override
    public void modelChanged() {

    }
}
