import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(30)); 
        stackPane.setStyle("-fx-background-color: lightblue;");

        Button policeButton = new Button("Police");
        policeButton.setPrefSize(150, 50);
        policeButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 900;");
        Button ticketButton = new Button("Pay Ticket");
        ticketButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 900;");
        ticketButton.setPrefSize(150, 50);
        Label titleLabel = new Label("Choose an Option");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: 900;");
        
        HBox buttonsBox = new HBox(policeButton, ticketButton);
        buttonsBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonsBox.setSpacing(40); 

        VBox titleBox = new VBox(titleLabel);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setSpacing(80); 
        
        VBox containerBox = new VBox(buttonsBox);
        containerBox.setAlignment(Pos.BOTTOM_CENTER);
        containerBox.setSpacing(80); 

        stackPane.getChildren().addAll(titleBox, buttonsBox);

        Scene scene = new Scene(stackPane, 400, 300);
        primaryStage.setTitle("Main Page");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        policeButton.setOnAction(e -> {
            primaryStage.close();
            clickPolice1();
        
        });
        
        ticketButton.setOnAction(e -> {
            primaryStage.close();
            clickTicket1();
        
        });
        
        
    }
    private void clickPolice1() {

    	Police1 police1 = new Police1();
        police1.start(new Stage());
        
    }
    private void clickTicket1() {
    	Ticket1 ticket1 = new Ticket1();
    	ticket1.start(new Stage());
    }

    
   
    public static void main(String[] args) {
        launch(args);
    }
}