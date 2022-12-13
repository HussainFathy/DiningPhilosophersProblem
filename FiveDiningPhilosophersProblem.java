/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication4;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author hussa
 */
public class New extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 804, 698);

        /* the table*/
        Circle circleb = new Circle();
        circleb.setCenterX(389);
        circleb.setCenterY(446);
        circleb.setRadius(130);
        circleb.setFill(Color.rgb(100, 10, 18));

        /*philosopher 0*/
        Circle circle0 = new Circle();
        circle0.setCenterX(270);
        circle0.setCenterY(582);
        circle0.setRadius(39);
        circle0.setFill(Color.BLACK);

        /*philosopher 1*/
        Circle circle1 = new Circle();
        circle1.setCenterX(506);
        circle1.setCenterY(582);
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

        Circle circleHun0 = new Circle();
        circleHun0.setCenterX(270);
        circleHun0.setCenterY(582);
        circleHun0.setRadius(39);
        circleHun0.setFill(Color.YELLOW);

        Circle circleHun1 = new Circle();
        circleHun1.setCenterX(506);
        circleHun1.setCenterY(582);
        circleHun1.setRadius(39);
        circleHun1.setFill(Color.YELLOW);

        Circle circleHun2 = new Circle();
        circleHun2.setCenterX(550);
        circleHun2.setCenterY(370);
        circleHun2.setRadius(39);
        circleHun2.setFill(Color.YELLOW);

        Circle circleHun3 = new Circle();
        circleHun3.setCenterX(388);
        circleHun3.setCenterY(265);
        circleHun3.setRadius(39);
        circleHun3.setFill(Color.YELLOW);

        Circle circleHun4 = new Circle();
        circleHun4.setCenterX(223);
        circleHun4.setCenterY(378);
        circleHun4.setRadius(39);
        circleHun4.setFill(Color.YELLOW);

        Circle circleEat0 = new Circle();
        circleEat0.setCenterX(270);
        circleEat0.setCenterY(582);
        circleEat0.setRadius(39);
        circleEat0.setFill(Color.BLUE);

        Circle circleEat1 = new Circle();
        circleEat1.setCenterX(506);
        circleEat1.setCenterY(582);
        circleEat1.setRadius(39);
        circleEat1.setFill(Color.BLUE);

        Circle circleEat2 = new Circle();
        circleEat2.setCenterX(550);
        circleEat2.setCenterY(370);
        circleEat2.setRadius(39);
        circleEat2.setFill(Color.BLUE);

        Circle circleEat3 = new Circle();
        circleEat3.setCenterX(388);
        circleEat3.setCenterY(265);
        circleEat3.setRadius(39);
        circleEat3.setFill(Color.BLUE);

        Circle circleEat4 = new Circle();
        circleEat4.setCenterX(223);
        circleEat4.setCenterY(378);
        circleEat4.setRadius(39);
        circleEat4.setFill(Color.BLUE);

        Circle circleEating = new Circle();
        circleEating.setCenterX(273);
        circleEating.setCenterY(66);
        circleEating.setRadius(24);
        circleEating.setFill(Color.BLUE);

        Circle circleHungry = new Circle();
        circleHungry.setCenterX(558);
        circleHungry.setCenterY(66);
        circleHungry.setRadius(24);
        circleHungry.setFill(Color.YELLOW);

        Label Hun = new Label("User is hungry :");
        Hun.setLayoutX(159);
        Hun.setLayoutY(62);

        Label Eat = new Label("User is eating :");
        Eat.setLayoutX(448);
        Eat.setLayoutY(62);

        Line line0 = new Line();
        line0.setStartX(0.0f);
        line0.setStartY(0.0f);
        line0.setEndX(100.0f);
        line0.setEndY(100.0f);
        line0.setFill(Color.YELLOW);

        Line line1 = new Line();
        line1.setStartX(0.0f);
        line1.setStartY(0.0f);
        line1.setEndX(100.0f);
        line1.setEndY(100.0f);
        line1.setFill(Color.YELLOW);

        Line line2 = new Line();
        line2.setStartX(0.0f);
        line2.setStartY(0.0f);
        line2.setEndX(100.0f);
        line2.setEndY(100.0f);
        line2.setFill(Color.YELLOW);

        Line line3 = new Line();
        line3.setStartX(0.0f);
        line3.setStartY(0.0f);
        line3.setEndX(100.0f);
        line3.setEndY(100.0f);
        line3.setFill(Color.YELLOW);

        Line line4 = new Line();
        line4.setStartX(0.0f);
        line4.setStartY(0.0f);
        line4.setEndX(100.0f);
        line4.setEndY(100.0f);
        line4.setFill(Color.YELLOW);

        /*philosopher 0 hungry button */
        ToggleButton btn0 = new ToggleButton();
        btn0.setLayoutX(188);
        btn0.setLayoutY(626);
        btn0.setText("Philosopher 0");
        btn0.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!0");
            }
        });

        /*philosopher 1 hungry button */
        ToggleButton btn1 = new ToggleButton();
        btn1.setLayoutX(486);
        btn1.setLayoutY(626);
        btn1.setText("Philosopher 1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!1");
            }
        });

        /*philosopher 2 hungry button */
        ToggleButton btn2 = new ToggleButton();
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
        ToggleButton btn3 = new ToggleButton();
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
        ToggleButton btn4 = new ToggleButton();
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
        ToggleButton btnH = new ToggleButton();
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
        root.getChildren().add(circleHun0);
        root.getChildren().add(circleHun1);
        root.getChildren().add(circleHun2);
        root.getChildren().add(circleHun3);
        root.getChildren().add(circleHun4);
        root.getChildren().add(circleEat0);
        root.getChildren().add(circleEat1);
        root.getChildren().add(circleEat2);
        root.getChildren().add(circleEat3);
        root.getChildren().add(circleEat4);
        root.getChildren().add(circleEating);
        root.getChildren().add(circleHungry);
        
        

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
