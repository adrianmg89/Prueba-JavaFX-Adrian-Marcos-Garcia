package control;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class MainFX extends Application {
	Stage ventana1;

	@Override
	public void start(Stage primaryStage) {
		try {
			ventana1 = primaryStage;
			pantallaPrincipal();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void pantallaPrincipal() {
		try {
			FXMLLoader carga = new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
			AnchorPane panel = carga.load();

			Font.loadFont(getClass().getResourceAsStream("../vista/assets/fonts/PoiretOne-Regular"),20);
			ventana1.setScene(new Scene(panel));
			ventana1.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
