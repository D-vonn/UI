import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NoTicket extends Application {

    @Override
    public void start(Stage noTicketStage) {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(30)); 
        stackPane.setStyle("-fx-background-color: lightblue;");

        // ITEMS
        Button returnButton = new Button("Return");
        returnButton.setPrefSize(150, 50);
        returnButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 900;");

        Label titleLabel = new Label("No Tickets Found");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: 900;");

        Label label1 = new Label("Please Click the Return Button and Try Again");


        

        // BOXES FOR ITEMS
        HBox buttonsBox = new HBox(returnButton);
        buttonsBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonsBox.setSpacing(40);

        VBox titleBox = new VBox(titleLabel);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setSpacing(20);
        
        
        VBox textfieldBox1 = new VBox(10); 
        textfieldBox1.setAlignment(Pos.CENTER);
        textfieldBox1.getChildren().addAll(label1);
    
        
        HBox textfieldVBox = new HBox();
        textfieldVBox.getChildren().addAll(textfieldBox1);
        textfieldVBox.setAlignment(Pos.CENTER);
        textfieldVBox.setSpacing(30);
        
       

        // COMPILE BOXES INTO STACKPANE
        stackPane.getChildren().addAll(titleBox, textfieldVBox,buttonsBox);

        Scene scene = new Scene(stackPane, 400, 300);
        noTicketStage.setTitle("No Tickets Found");
        noTicketStage.setScene(scene);
        noTicketStage.show();

        returnButton.setOnAction(e -> clickReturn(noTicketStage));
    }

    private void clickReturn(Stage currentStage) {
        currentStage.close();
        MainUI mainUI = new MainUI();
        Stage mainStage = new Stage();
        mainUI.start(mainStage);
    }

    private void clickSubmit(Stage currentStage) { ////////////////////THIS IS WHERE DATA -> DATABASE FOR LOGIN KEY
        currentStage.close();
        NoTicket ticket1 = new NoTicket();
        Stage ticketStage = new Stage();
        ticket1.start(ticketStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}