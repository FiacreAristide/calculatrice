package application.vue;

import application.controller.CalculatriceController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatriceVue {
	private TextField tfNumber1 = new TextField();
	private TextField tfNumber2 = new TextField();
	private TextField tfResult = new TextField();
	private Button btAdd = new Button("Addition");
	private Button btSubtract = new Button("Soustraction");
	private Button btMultiply = new Button("Multiplication");
	private Button btDivide = new Button("Division");
	private Label errLabel = new Label();
	
	private CalculatriceController controller;
	
	//Definition du constructeur
	
	public CalculatriceVue(Stage primaryStage) {
		 	BorderPane pane = new BorderPane();
	        HBox hBox1 = new HBox();
			hBox1.setSpacing(30);
			hBox1.setPadding(new Insets(40,0,0,0));
			
			HBox hBox3 = new HBox();
			hBox3.setSpacing(10);
			hBox3.setPadding(new Insets(88,0,0,0));
			
			
			
			VBox vbox1 = new VBox();
			vbox1.setPadding(new Insets(40));
			
			vbox1.setSpacing(30);
			VBox vbox2 = new VBox();
			vbox2.setSpacing(30);
			vbox2.setPadding(new Insets(40,0,0,0));
			
			VBox vbox3 = new VBox();
			vbox3.setPadding(new Insets(8,0,0,0));
			vbox3.getChildren().add(hBox3);
			
			
			hBox1.setBackground(new Background(new BackgroundFill(Color.PALEGOLDENROD,CornerRadii.EMPTY,Insets.EMPTY)));
			hBox1.getChildren().addAll(vbox1,vbox2,vbox3);
			

			
			Label num1label =new Label("Nombre 1: ");
			num1label.setFont(new Font("Arial",24));
			Label num2label =new Label("Nombre 2: ");
			num2label.setFont(new Font("Arial",24));
			Label reslabel= new Label("Résultat: ");
			reslabel.setFont(new Font("Arial",24));
			errLabel.setTextFill(Color.RED);
			errLabel.setFont(new Font("Arial",15));


			
			
			btAdd.setFont(new Font("Arial",24));
			btAdd.setBackground(new Background(new BackgroundFill(Color.ORANGE,new CornerRadii(20),Insets.EMPTY)));
			btSubtract.setFont(new Font("Arial",24));
			btSubtract.setBackground(new Background(new BackgroundFill(Color.ORANGE,new CornerRadii(20),Insets.EMPTY)));
			btMultiply.setFont(new Font("Arial",24));
			btMultiply.setBackground(new Background(new BackgroundFill(Color.ORANGE,new CornerRadii(20),Insets.EMPTY)));
			btDivide.setFont(new Font("Arial",24));
			btDivide.setBackground(new Background(new BackgroundFill(Color.ORANGE,new CornerRadii(20),Insets.EMPTY)));
			
			
			vbox1.getChildren().add(num1label);
			vbox2.getChildren().add(tfNumber1);
			vbox1.getChildren().add(num2label);
			vbox2.getChildren().add(tfNumber2);
			hBox3.getChildren().add(reslabel);
			hBox3.getChildren().add(tfResult);
			vbox3.getChildren().add(errLabel);


			
			HBox hBox2 = new HBox();
			hBox2.setPadding(new Insets(10));
			hBox2.setSpacing(50);
			hBox2.setBackground(new Background(new BackgroundFill(Color.PALEGOLDENROD,CornerRadii.EMPTY,Insets.EMPTY)));

			
			hBox2.getChildren().add(btAdd);
			hBox2.getChildren().add(btSubtract);
			hBox2.getChildren().add(btMultiply);
			hBox2.getChildren().add(btDivide);

			
			pane.setTop(hBox1); 
			pane.setCenter(hBox2);
			
			hBox2.setAlignment(Pos.CENTER);
			
			


	        Scene scene = new Scene(pane, 800, 500);
	        primaryStage.setResizable(false);
	        primaryStage.setTitle("Calculatrice");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        }
	
		public double getNumber1() {
			try {
				return Double.parseDouble(tfNumber1.getText());
			} catch (NumberFormatException e) {
				return 0.0;
			}
		}
		
		 public double getNumber2() {
	            try {
	                return Double.parseDouble(tfNumber2.getText());
	            } catch (NumberFormatException e) {
	                return 0.0;
	            }
	        }

	        public void setResult(double result) {
	            tfResult.setText(String.valueOf(result));
	        }

	        public void showError(String errorMessage) {
	            errLabel.setText("Erreur: "+errorMessage);
	        }

	        public void clearError() {
	            errLabel.setText("");
	        }
	        
	        public void clearResult() {
	            tfResult.setText("");
	        }

	        public void setController(CalculatriceController controller) {
	            this.controller = controller;
	        }
	        


}
