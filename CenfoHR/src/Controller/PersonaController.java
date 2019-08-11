/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BusinessLayer.PersonalLogica;
import Entities.Personal;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PersonaController implements Initializable {
    PersonalLogica mipersonal=new PersonalLogica();
    @FXML
    private AnchorPane pnlInicioSesion;

    @FXML
    private TextField tfCorreo;

    @FXML
    private Button btnIngresar;

    @FXML
    private TextField tfContraseña;

    @FXML
    public void ingresaSesion(ActionEvent event) throws Exception {
        Personal miPersonal=(Personal) mipersonal.buscarObjeto(tfCorreo);
        System.out.print(miPersonal.getRol()+" "+miPersonal.getNombre());
        if (tfContraseña.getText().equals("daniela")) {
            AnchorPane pane1 = FXMLLoader.load(getClass().getResource("/Resources/UiEmpleado.fxml"));
            pnlInicioSesion.getChildren().setAll(pane1);
        } else {
            AnchorPane pane2 = FXMLLoader.load(getClass().getResource("/Resources/UiSuperior.fxml"));
            pnlInicioSesion.getChildren().setAll(pane2);
       
        }
    }

    public void initialize(URL location, ResourceBundle resources) {
        //TODO
    }
}
