package com.example.groupcode;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class mainView extends StackPane implements ModelSubscriber{

    private Model model;

    private Button addAnItem;

    private Button inventory;

    private Button expiryInformation;

    private Button locationSearch;

    public mainView(){
        ArrayList<Button> buttonList = new ArrayList<>();
        addAnItem = new Button("add an item");
        buttonList.add(addAnItem);
        inventory = new Button("view inventory");
        buttonList.add(inventory);
        expiryInformation = new Button("expiry information");
        buttonList.add(expiryInformation);
        locationSearch = new Button("location search");
        buttonList.add(locationSearch);
        buttonList.forEach(button -> {
            button.setTextFill(Color.WHITE);
            button.setStyle("-fx-background-color: purple; ");
            button.setPadding(new Insets(10));
        });
        //set up the buttons

        ArrayList<VBox> boxArrayList = new ArrayList<>();
        VBox mainPage = new VBox();
        VBox boxAddItem = new VBox();
        boxAddItem.getChildren().add(addAnItem);
        boxArrayList.add(boxAddItem);

        VBox boxInventory = new VBox();
        boxInventory.getChildren().add(inventory);
        boxArrayList.add(boxInventory);

        VBox boxExpiry = new VBox();
        boxExpiry.getChildren().add(expiryInformation);
        boxArrayList.add(boxExpiry);

        VBox boxLocation = new VBox();
        boxLocation.getChildren().add(locationSearch);
        boxArrayList.add(boxLocation);

        boxArrayList.forEach(vBox -> {
            vBox.setAlignment(Pos.CENTER);
            vBox.setPadding(new Insets(30));
        });
        //set up the position of vboxes and padding of vboxes

        mainPage.getChildren().addAll(boxAddItem,boxInventory,boxExpiry,boxLocation);
        mainPage.setAlignment(Pos.CENTER);

        this.getChildren().add(mainPage);
        this.setPrefSize(300,500);

    }

    public void setController(Controller controller){
        addAnItem.setOnMouseClicked(e -> controller.handleAddItem());
        inventory.setOnMouseClicked(e -> controller.handleInventory());
        expiryInformation.setOnMouseClicked(e -> controller.handleExpiryInformation());
        locationSearch.setOnMouseClicked(e -> controller.handleSearchItem());
    }

    @Override
    public void modelChanged() {

    }
}
