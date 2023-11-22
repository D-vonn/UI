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

public class Ticket1 extends Application {

    @Override
    public void start(Stage police1Stage) {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(30)); 
        stackPane.setStyle("-fx-background-color: lightblue;");

        // ITEMS
        Button returnButton = new Button("Return");
        returnButton.setPrefSize(150, 50);
        returnButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 900;");

        Button submitButton = new Button("Submit");
        submitButton.setStyle("-fx-font-size: 15px; -fx-font-weight: 900;");
        submitButton.setPrefSize(150, 50);

        Label titleLabel = new Label("Driver Login");
        titleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: 900;");

        TextField textField1 = new TextField();
        Label label1 = new Label("Enter Your Full Name");
        label1.setStyle("-fx-font-weight: 900;");


        TextField textField2 = new TextField();
        Label label2 = new Label("Enter Your Licence Plate");
        label2.setStyle("-fx-font-weight: 900;");

        

        // BOXES FOR ITEMS
        HBox buttonsBox = new HBox(returnButton, submitButton);
        buttonsBox.setAlignment(Pos.BOTTOM_CENTER);
        buttonsBox.setSpacing(40);

        VBox titleBox = new VBox(titleLabel);
        titleBox.setAlignment(Pos.TOP_CENTER);
        titleBox.setSpacing(20);
        
        

        // VBox for text fields and labels
        VBox textfieldBox1 = new VBox(10); // Adjust spacing as needed
        textfieldBox1.setAlignment(Pos.CENTER);
        textfieldBox1.getChildren().addAll(label1, label2);
        VBox textfieldBox2 = new VBox(10); // Adjust spacing as needed
        textfieldBox2.setAlignment(Pos.CENTER);
        textfieldBox2.getChildren().addAll(textField1, textField2);
        
        
        HBox textfieldVBox = new HBox();
        textfieldVBox.getChildren().addAll(textfieldBox1, textfieldBox2);
        textfieldVBox.setAlignment(Pos.CENTER);
        textfieldVBox.setSpacing(30);
        
       

        // COMPILE BOXES INTO STACKPANE
        stackPane.getChildren().addAll(titleBox, textfieldVBox,buttonsBox);

        Scene scene = new Scene(stackPane, 400, 300);
        police1Stage.setTitle("Driver Login");
        police1Stage.setScene(scene);
        police1Stage.show();

        returnButton.setOnAction(e -> clickReturn(police1Stage));
        submitButton.setOnAction(e -> clickSubmit(police1Stage));
    }

    private void clickReturn(Stage currentStage) {
        currentStage.close();
        MainUI mainUI = new MainUI();
        Stage mainStage = new Stage();
        mainUI.start(mainStage);
    }

    private void clickSubmit(Stage currentStage) { ////////////////////THIS IS WHERE DATA -> DATABASE FOR LOGIN KEY
        currentStage.close();
        Ticket1 ticket1 = new Ticket1();
        Stage ticketStage = new Stage();
        ticket1.start(ticketStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}