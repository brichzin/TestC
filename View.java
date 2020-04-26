import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 26.04.2020
 * @author 
 */

public class View extends Application {
  // Anfang Attribute
  private Label lTierestartenBegruessung = new Label();
  private Button bOK = new Button();
  private Label labelAusgabe = new Label();
  // Ende Attribute
  
  public void start(Stage primaryStage) { 
    Pane root = new Pane();
    Scene scene = new Scene(root, 284, 262);
    // Anfang Komponenten
    
    lTierestartenBegruessung.setLayoutX(32);
    lTierestartenBegruessung.setLayoutY(8);
    lTierestartenBegruessung.setPrefHeight(33);
    lTierestartenBegruessung.setPrefWidth(193);
    lTierestartenBegruessung.setText("Tiere starten Begrüßung ?");
    lTierestartenBegruessung.setContentDisplay(ContentDisplay.CENTER);
    lTierestartenBegruessung.setAlignment(Pos.CENTER);
    root.getChildren().add(lTierestartenBegruessung);
    bOK.setLayoutX(104);
    bOK.setLayoutY(48);
    bOK.setPrefHeight(33);
    bOK.setPrefWidth(41);
    bOK.setOnAction(
      (event) -> {bOK_Action(event);} 
    );
    bOK.setText("OK");
    root.getChildren().add(bOK);
    labelAusgabe.setLayoutX(24);
    labelAusgabe.setLayoutY(96);
    labelAusgabe.setPrefHeight(113);
    labelAusgabe.setPrefWidth(233);
    labelAusgabe.setText("");
    root.getChildren().add(labelAusgabe);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("View");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public View
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
  } // end of main
  
  public void bOK_Action(Event evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bOK_Action

  // Ende Methoden
} // end of class View

