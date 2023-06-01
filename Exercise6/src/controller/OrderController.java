package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class OrderController implements Initializable {

    static BedroomLamp blamp = new BedroomLamp();
    static CeilingLamp clamp = new CeilingLamp();
    static WallLamp wlamp = new WallLamp();

    @FXML
    Label name1, name2, name3, price1, price2, price3, qty1, qty2, qty3, amt2, amt3, total;
    double amt1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
        if (OrderController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            price1.setVisible(true);
            qty1.setVisible(true);

            amt1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
        }
        
        
    }

}
