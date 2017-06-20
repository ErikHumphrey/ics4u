/** @name Hometown Hero
 *  @author Erik Humphrey
 *  @date 2017-06-20
 *  @description Sidescrolling platform game in which the player controls a character that must avoid obstacles
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.util.*;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// TODO:
// * Edit background to add signs that show the game's controls and give an idea of the player's position
// * Make game playable
// * Add the ability for the hero to attack enemies
// * Add enemies
// * Add sprite animations
// * Use trigonometry from UFO assignment to improve spinning effect
// * Graphically show score/time played
// * Save and load time played and position of character
// * Make save selection screen work
// * Add character selection screen
// * Draw images that aren't placeholder or import sprite images
// * Add self-made 3D ground image
// * Add custom cursors

public class Main extends Application {

    boolean gameStarted = true;
    Game g;

    @Override
    public void start(Stage mainWindow) {
        // Define window parameters
        mainWindow.setTitle("Hometown Hero");
        mainWindow.setWidth(854);
        mainWindow.setHeight(480);
        mainWindow.centerOnScreen();
        mainWindow.setResizable(false);

        mainWindow.show();
        Button btnStart = new Button("Continue game");
        Button btnUpdate = new Button("Update game");

        Group buttons = new Group();
        Scene menu = new Scene(buttons);

        Group saveFiles = new Group();
        Scene saveSelect = new Scene(saveFiles);

        Button btnSelect = new Button("Select");
        saveFiles.getChildren().add(btnSelect);
        btnSelect.setLayoutX(660);
        btnSelect.setLayoutY(370);
        btnSelect.setFont(Font.font("Constantia", FontWeight.BOLD, 25));

        Button btnDelete = new Button("Delete");
        saveFiles.getChildren().add(btnDelete);
        btnDelete.setLayoutX(64);
        btnDelete.setLayoutY(370);
        btnDelete.setFont(Font.font("Constantia", FontWeight.LIGHT, 25));
        btnDelete.setDisable(true);

        Rectangle save1 = new Rectangle(65, 25, 700, 100);
        save1.setFill(Color.rgb(239, 239, 239));
        save1.setStroke(Color.rgb(165, 165, 165));
        saveFiles.getChildren().add(save1);

        Rectangle save2 = new Rectangle(65, 140, 700, 100);
        save2.setFill(Color.rgb(239, 239, 239));
        save2.setStroke(Color.rgb(165, 165, 165));
        saveFiles.getChildren().add(save2);

        Rectangle save3 = new Rectangle(65, 255, 700, 100);
        save3.setFill(Color.rgb(239, 239, 239));
        save3.setStroke(Color.rgb(165, 165, 165));
        saveFiles.getChildren().add(save3);

        Text saveName = new Text("Save1");
        saveName.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        saveFiles.getChildren().add(saveName);

        // This should be a class
        save1.setOnMouseClicked(new EventHandler < MouseEvent > () {
            @Override public void handle(MouseEvent e) {
                save1.setFill(Color.rgb(239, 231, 172));
                save1.setStroke(Color.rgb(239, 205, 2));

                save2.setFill(Color.rgb(239, 239, 239));
                save2.setStroke(Color.rgb(165, 165, 165));

                save3.setFill(Color.rgb(239, 239, 239));
                save3.setStroke(Color.rgb(165, 165, 165));
            }
        });

        save2.setOnMouseClicked(new EventHandler < MouseEvent > () {
            @Override public void handle(MouseEvent e) {
                save2.setFill(Color.rgb(239, 231, 172));
                save2.setStroke(Color.rgb(239, 205, 2));

                save1.setFill(Color.rgb(239, 239, 239));
                save1.setStroke(Color.rgb(165, 165, 165));

                save3.setFill(Color.rgb(239, 239, 239));
                save3.setStroke(Color.rgb(165, 165, 165));
            }
        });

        save3.setOnMouseClicked(new EventHandler < MouseEvent > () {
            @Override public void handle(MouseEvent e) {
                save3.setFill(Color.rgb(239, 231, 172));
                save3.setStroke(Color.rgb(239, 205, 2));

                save1.setFill(Color.rgb(239, 239, 239));
                save1.setStroke(Color.rgb(165, 165, 165));

                save2.setFill(Color.rgb(239, 239, 239));
                save2.setStroke(Color.rgb(165, 165, 165));
            }
        });

        buttons.getChildren().add(btnStart);

        VBox vb = new VBox(); // Create box of vertically aligned elements
        vb.setPadding(new Insets(70, 427, 50, 50));
        vb.setSpacing(10);

        Text title = new Text("Hometown Hero");
        title.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 15));
        vb.getChildren().add(title);
        vb.getChildren().add(btnStart);
        vb.getChildren().add(btnUpdate);

        buttons.getChildren().add(vb);

        mainWindow.setScene(menu);

        btnSelect.setOnMouseClicked(new EventHandler < MouseEvent > () {
            @Override public void handle(MouseEvent e) {
                System.out.println("Loading saved game.");
                // Load saved game from file here
                System.out.println("Loaded saved game " + 1 + " successfully.");
                g = new Game();
                mainWindow.setScene(g.gameplay);
            }
        });

        btnStart.setOnAction(new EventHandler < ActionEvent > () {
            @Override public void handle(ActionEvent e) {
                mainWindow.setScene(saveSelect);
            }
        });

        // Download the source code of the project and images from the internet, then close the program
        btnUpdate.setOnAction(new EventHandler < ActionEvent > () {
            @Override public void handle(ActionEvent e) {
                System.out.println("Preparing to update.");
                // Download list of source files
                File textFile = new File("files.txt");
                if (textFile.exists()) {
                    System.out.println("Deleting old list of files.");
                    textFile.delete();
                }
                try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(textFile), "UTF-8"))) {
                    Scanner web = new Scanner(new URL("https://raw.githubusercontent.com/ErikHumphrey/ics4u/master/2017/HumphreyErikRSTDraft/src/files.txt").openStream(), "UTF-8");
                    web.useDelimiter("\\A");
                    String out = web.next();
                    web.close();
                    writer.write(out);
                    writer.flush(); // Update the file
                    System.out.println("Downloaded new list of files.");
                    try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
                        String line;
                        while ((line = br.readLine()) != "a") {
                            if (line != null) System.out.println("Downloading " + line + ".");
                            try (InputStream in = new URL("https://raw.githubusercontent.com/ErikHumphrey/ics4u/master/2017/HumphreyErikRSTDraft/src/" + line).openStream()) {
                                Files.copy( in , Paths.get(line), StandardCopyOption.REPLACE_EXISTING);
                            }
                        }

                    }
                } catch (IOException e3) {
                    System.out.println("Closing program. Compile and run the program and it will be up-to-date!");
                    System.exit(0);
                    // System.err.println("IOException: " + e3.getMessage());
                }

                // TODO: Delete files that are no longer part of the program.
            }
        });

        /* Would be used for cartoon-like transition animation where circle closes/opens up around character as scene changes
        Shape circle = new Circle(400, 210, 200);
        Shape rect = new Rectangle(0, 0, 854, 480);
        Shape region = Shape.subtract(rect, circle);
        region.setFill(Color.BLACK);
        saveFiles.getChildren().add(region); */
    }

    // When the Application is closed, the stop() method is triggered
    @Override
    public void stop() {
        System.out.println("Hometown Hero is closing.");
        try {
            g.timer.cancel();
        } catch (NullPointerException e) {} // Stop the timer so it doesn't keep running after program closes
        // The game would be saved here
    }
}