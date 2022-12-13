/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;
import javafx.scene.paint.Color; 
//import java.awt.Color;
import static java.awt.Color.red;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton ;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



/**
 *
 * @author hussa
 */
public class FiveDiningPhilosophersProblem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 804, 698);
        
        /* the table*/
        Circle circleb = new Circle();
        circleb.setCenterX(389);
        circleb.setCenterY(446);
        circleb.setRadius(130);
        circleb.setFill(Color.rgb(100,10,18));   
        
        /*philosopher 0*/
        Circle circle0 = new Circle();
        circle0.setCenterX(270);
        circle0.setCenterY(582);
        circle0.setRadius(39);
        circle0.setFill(Color.BLACK);
        
        
         /*philosopher 1*/
        Circle circle1 = new Circle();
        circle1.setCenterX(519);
        circle1.setCenterY(568);
        circle1.setRadius(39);
        circle1.setFill(Color.BLACK);
        
         /*philosopher 2*/
        Circle circle2 = new Circle();
        circle2.setCenterX(550);
        circle2.setCenterY(370);
        circle2.setRadius(39);
        circle2.setFill(Color.BLACK);
        
        
         /*philosopher 3*/
        Circle circle3 = new Circle();
        circle3.setCenterX(388);
        circle3.setCenterY(265);
        circle3.setRadius(39);
        circle3.setFill(Color.BLACK);
        
        
         /*philosopher 4*/
        Circle circle4 = new Circle();
        circle4.setCenterX(223);
        circle4.setCenterY(378);
        circle4.setRadius(39);
        circle4.setFill(Color.BLACK);
        
              
  

				/*philosopher 0 hungry button */
        ToggleButton  btn0 = new ToggleButton ();
        btn0.setLayoutX(210);
        btn0.setLayoutY(626);
        btn0.setText("Philosopher 0");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!0");
            }
        });
        
        /*philosopher 1 hungry button */
        ToggleButton  btn1 = new ToggleButton ();
        btn1.setLayoutX(486);
        btn1.setLayoutY(621);
        btn1.setText("Philosopher 1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!1");
            }
        });
        
        /*philosopher 2 hungry button */
        ToggleButton  btn2 = new ToggleButton ();
        btn2.setLayoutX(602);
        btn2.setLayoutY(356);
        btn2.setText("Philosopher 2");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!0");
            }
        }); 
        
        
        /*philosopher 3 hungry button */
        ToggleButton  btn3 = new ToggleButton ();
        btn3.setLayoutX(330);
        btn3.setLayoutY(190);
        btn3.setText("Philosopher 3");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!1");
            }
        });
        
        /*philosopher 4 hungry button */
        ToggleButton  btn4 = new ToggleButton ();
        btn4.setLayoutX(63);
        btn4.setLayoutY(364);
        btn4.setText("Philosopher 4");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!1");
            }
        });
        
                /*ALL hungry button */
        ToggleButton  btnH = new ToggleButton ();
        btnH.setLayoutX(661);
        btnH.setLayoutY(620);
        btnH.setText("ALL Hungry");
        btnH.setMinSize(50, 60);
        btnH.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!1");
            }
        });
        
                
        

        
        root.getChildren().add(btn0);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btnH);
        root.getChildren().add(circleb);
        root.getChildren().add(circle0);
        root.getChildren().add(circle1);
        root.getChildren().add(circle2);
        root.getChildren().add(circle3);
        root.getChildren().add(circle4);
        
        

        
        primaryStage.setTitle("Dining philosepher ");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}




