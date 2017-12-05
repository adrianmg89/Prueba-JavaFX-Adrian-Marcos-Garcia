package vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import control.MainFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ControlFX implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	@FXML
	public void cerrarPantalla(){
		System.exit(0);
	}
	@FXML
	public void cambioSecundaria() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFX.class.getResource("../vista/FreeSolo.fxml"));
			AnchorPane panel = (AnchorPane) loader.load();
			Stage scena = new Stage();
			Scene escena = new Scene(panel);
			scena.setScene(escena);
			scena.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
