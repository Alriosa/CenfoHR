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

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane panelPaCambiar;
    @FXML
    private Button btnBandeja;
    @FXML
    private Button btnMensajes;
    @FXML
    private Button btnPerfil;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    void panelBandeja(ActionEvent event) {

    }

    @FXML
    void panelInicioSesion(ActionEvent event) {

    }

    @FXML
    public void panelMensajes(ActionEvent event) throws IOException {
        AnchorPane pane2 = FXMLLoader.load(getClass().getResource("/Resources/NotificacionesOpcion.fxml"));
    panelPaCambiar.getChildren().setAll(pane2);
    }

    @FXML
    void panelPerfil(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }

}
