import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	public static void main(String[] args)  {
		launch(args);

	}
	
	@Override
	public void start(Stage mainWindow) {
		mainWindow.setTitle("Hometown Hero");
		mainWindow.setWidth(854);
		mainWindow.setHeight(480);
        mainWindow.centerOnScreen();
		mainWindow.setResizable(false);

		mainWindow.show();
		Button btnStart = new Button("Start");
		
		VBox vb = new VBox();
		vb.setPadding(new Insets(10, 50, 50, 50));
		vb.setSpacing(10);
		
        // GridPane layout = new GridPane();
        vb.getChildren().add(btnStart);
		
        Scene scene = new Scene(vb);
        mainWindow.setScene(scene);
        
        Text title = new Text("Placeholder");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 40));
        vb.getChildren().add(title);
	}

}
