package src.hust.soict.hedspi.aims.Screen;

import javax.swing.JFrame;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import src.hust.soict.hedspi.aims.store.Store;
import src.hust.soict.hedspi.aims.Screen.controller.AddDVDScreenController;

public class AddDigitalVideoDiscToStoreScreen extends JFrame{

    private static Store store;
    
    public static void main(String[] args) {
		new AddDigitalVideoDiscToStoreScreen(store);
	}

    public AddDigitalVideoDiscToStoreScreen(Store store) {

        super();

        AddDigitalVideoDiscToStoreScreen.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Add DVD");
        this.setSize(1024, 768);
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("addDVD.fxml"));//hust/soict/cybersec/aims/screen/view/addDVD.fxml
                    
                    AddDVDScreenController controller = new AddDVDScreenController(store);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    
}
