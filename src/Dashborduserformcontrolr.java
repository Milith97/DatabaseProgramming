import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashborduserformcontrolr {
    public AnchorPane workingContext;

    public TextField txtName;
    public TextField txtEmail;
    public TextField txtContactNumber;
    public TextField txtAddress;
    public TextField txtNic;

    public void initialize() throws IOException {
        workingContext.getChildren().clear();
        Parent parent = FXMLLoader.load(DashboardFormController.class.getResource("OmeForm.fxml"));
        workingContext.getChildren().add(parent);
    }

    public void numberone(ActionEvent actionEvent) throws IOException {
        workingContext.getChildren().clear();
        Parent parent = FXMLLoader.load(DashboardFormController.class.getResource("OmeForm.fxml"));
        workingContext.getChildren().add(parent);
    }

    public void numbertwo(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) workingContext.getScene().getWindow();
        stage.close();
    }
}
