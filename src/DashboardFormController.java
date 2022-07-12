import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLOutput;

public class DashboardFormController {


    public TextField txtUsername;


    public TextField txtPassword;
    public AnchorPane signContex;

    String username ="milith";
    String password ="1234";


    public void initialize(){

    }


    public void signInOnAction(ActionEvent actionEvent) throws IOException {


        if (username.equals(txtUsername.getText()) && password.equals(txtPassword.getText()))
        {
            Stage stage=(Stage) signContex.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(DashboardFormController.class.getResource("Dashborduserform.fxml"))));
            stage.centerOnScreen();
            stage.centerOnScreen();
            stage.show();
        }
        else
        {
            System.out.println("Incorrect");
        }
    }
}
