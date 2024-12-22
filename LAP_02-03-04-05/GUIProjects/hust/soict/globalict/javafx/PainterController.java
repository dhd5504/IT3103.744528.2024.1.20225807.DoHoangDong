/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.PainterController to edit this template
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class PainterController implements Initializable {

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private VBox drawingAreaPane;
    @FXML
    private RadioButton pen;
    @FXML
    private ToggleGroup Tools;
    @FXML
    private RadioButton eraser;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        assert drawingAreaPane != null : 
       "fx:id=\"drawingAreaPane\" was not injected: check your FXML file 'Painter.fxml'.";
    }    

    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        Rectangle clipArea = new Rectangle(0, 0, drawingAreaPane.getWidth(), drawingAreaPane.getHeight());
      drawingAreaPane.setClip(clipArea);
      Color inkColor = Color.BLACK;
      if (eraser.isSelected()) {
        inkColor = Color.WHITE;
      } 
      Circle newCircle = new Circle(event.getX(), event.getY(), 4, inkColor);
      drawingAreaPane.getChildren().add(newCircle);
    }
    
}
