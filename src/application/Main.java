package application;

import application.controller.CalculatriceController;
import application.model.CalculatriceModel;
import application.vue.CalculatriceVue;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) {
        CalculatriceModel model = new CalculatriceModel();
        CalculatriceVue view = new CalculatriceVue(primaryStage);
        CalculatriceController controller = new CalculatriceController(model, view);
        
    }
	
}

