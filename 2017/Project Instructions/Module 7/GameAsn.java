

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;



// Animation of Earth rotating around the sun. (Hello, world!)
public class GameAsn extends Application 
{
	
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage theStage) 
    {
    	
    	
        theStage.setTitle( "UFO Game" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        Canvas canvas = new Canvas( 512, 512 );
        root.getChildren().add( canvas );

        GraphicsContext gc = canvas.getGraphicsContext2D();

        // we need 4 images for this class
        // remember to move them into the src folder!
        Image earth = new Image( "earth.png" );
        Image sun   = new Image( "sun.png" );
        Image space = new Image( "space.png" );
        Image ufo = new Image("ufo_0.png");

        /*  *** ADD Code Section 1 (yellow) here *** */

        
        //only for testing
        //root.getChildren().add(earthData);
                
        final long startNanoTime = System.nanoTime();  //60 times per second
        
               
        /*  *** ADD Code Section 2 (pink) here *** */

   
        
        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                double t = (currentNanoTime - startNanoTime) / 1000000000.0; 

                double x = 232 + 128 * Math.cos(t);  // move the x coordinate on a cosine path
                double y = 232 + 128 * Math.sin(t);	 // move the y coordinate on a sine path

                // background image clears canvas
                gc.drawImage( space, 0, 0 );  //draw the background
                gc.drawImage( earth, x, y );  // draw the earth in a new location each tick
                gc.drawImage( sun, 196, 196 );
                
                /*  *** ADD Code Section 3 (green) here *** */

                              
                
                /*  *** ADD Code Section 4 (purple) here *** */
                                           
                /*  *** ADD Code Section 5 (orange) here *** */
            }
        
            
        }.start();
        
      
       
        

        theStage.show();
       
    }
}
