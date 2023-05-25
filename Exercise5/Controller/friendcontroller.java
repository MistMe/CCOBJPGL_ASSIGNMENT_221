package Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import Friend.*;

public class friendcontroller {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Emlan emlan = new Emlan();
    Darrel darrel = new Darrel();
    Jiu jiu = new Jiu();
    Keither keither = new Keither();
    Thea thea = new Thea();
    


    public void initialize() {

        emlan.setAge("19");
        emlan.setAppearance("Handsome");

        thea.setAge("19");
        thea.setAppearance("Beautiful");

        darrel.setAge("19");
        darrel.setAppearance("Handsome");

        keither.setAge("19");
        keither.setAppearance("Handsome");

        jiu.setAge("19");
        jiu.setAppearance("Beautiful");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hello, i'm " + keither.getAge() + " and " + keither.getApperance());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hello, i'm " + jiu.getAge() + " and " + jiu.getApperance());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Hello, i'm " + darrel.getAge() + " and " + darrel.getApperance());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hello, i'm " + thea.getAge() + " and " + thea.getApperance());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Hello, i'm " + emlan.getAge() + " and " + emlan.getApperance());
        }

        alert.showAndWait();

    }
}