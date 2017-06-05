import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
		Button btnStart2 = new Button("Options");
		Button btnStart3 = new Button("Quit");
		
		Group buttons = new Group();
		Scene menu = new Scene(buttons);
		
		GitHub github = new GitHub();
		
		
		buttons.getChildren().add(btnStart);

		BorderPane bp = new BorderPane();
		
		VBox vb = new VBox(); // Create box of vertically aligned elements
		vb.setPadding(new Insets(70, 427, 50, 50));
		vb.setSpacing(10);
		
		HBox hb = new HBox(); // Create box of horizontally aligned elements
		hb.setPadding(new Insets(20));
		hb.setSpacing(10);
		//bp.setCenter(vb);
		

        Text title = new Text("Placeholder");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        vb.getChildren().add(title);
		vb.getChildren().add(btnStart);
		vb.getChildren().add(btnStart2);
		vb.getChildren().add(btnStart3);
		
        FlowPane fp = new FlowPane();
        buttons.getChildren().add(vb);
        
        // GridPane layout = new GridPane();
        //vb.getChildren().add(btnStart);
        
        // GraphicsContent gc = canvas.getGraphicscontext25();
        
        System.out.println("Has anyone really been far even as decided to"
        				           + "use even go want to look more like?");
        
        System.out.println("It was at this moment that someone says they're still let down, and hanging around.");
        
        System.out.println("Shantae! Half-Genie Hero")
        
		mainWindow.setScene(menu);

	}

}
