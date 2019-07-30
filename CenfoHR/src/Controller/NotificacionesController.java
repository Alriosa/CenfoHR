/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author Shannon
 */
public class NotificacionesController implements Initializable{
    @FXML
    private Button btnHorasEntra;
    @FXML
    private AnchorPane pnlNotificaciones;
    @FXML
    private Button btnPermisoSalida;
    
    @FXML
    private void horasExtra(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Resources/HorasExtra.fxml"));
    pnlNotificaciones.getChildren().setAll(pane);
    }

    @FXML
    private void permisoSalida(ActionEvent event) throws IOException {
        AnchorPane pane2 = FXMLLoader.load(getClass().getResource("/Resources/PermisoSalida.fxml"));
    pnlNotificaciones.getChildren().setAll(pane2);
    }
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     //TODO
    }
}
