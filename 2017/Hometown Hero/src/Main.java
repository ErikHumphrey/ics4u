import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args)  {
		launch(args);

	}
	
	@Override
	public void start(Stage mainWindow) {
		mainWindow.setTitle("Hometown Hero");
		mainWindow.show();
		Button btnStart = new Button("Start");
		
        GridPane layout = new GridPane();
        layout.add(btnStart, 1, 4);
		
        Scene scene = new Scene(layout, 350, 275);
        mainWindow.setScene(scene);
	}

}
