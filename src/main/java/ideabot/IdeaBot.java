package ideabot;

//imports
import java.util.*;
import javafx.scene.control.MenuButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.Separator;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.stage.Modality;
import java.util.*;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;

/**
 * An App that diplays a random idea
 *
 * @author Kyle Helsing
 */
public class IdeaBot extends Application {
  //main method
    @Override
    public void start(Stage stage) {
	initUI(stage);
    } // start
    private void initUI(Stage stage){
	//main panel
	BorderPane root = new BorderPane();
	VBox center = new VBox();
	center.setAlignment(Pos.CENTER);
	center.setBackground(new Background(new BackgroundFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), .99), CornerRadii.EMPTY, Insets.EMPTY)));
	HBox top = new HBox();
	top.setAlignment(Pos.CENTER);
	HBox bottom = new HBox();
	bottom.setPadding(new Insets(10.0));
	bottom.setAlignment(Pos.CENTER);
	Button good = new Button("I Love It!");
	good.setStyle("-fx-font-size: 2em; -fx-background-color: lightgreen;");
	good.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent t) {
		    center.setBackground(new Background(new BackgroundFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), .99), CornerRadii.EMPTY, Insets.EMPTY)));
		} // handle
	    });
	Button bad = new Button("That's Dumb!");
	bad.setStyle("-fx-font-size: 2em; -fx-background-color: red;");
	bad.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent t) {
		    center.setBackground(new Background(new BackgroundFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), .99), CornerRadii.EMPTY, Insets.EMPTY)));
		} // handle
	    });
	Button okay = new Button("Good Words, Bad Combo!");
	okay.setStyle("-fx-font-size: 2em; -fx-background-color: orange;");
	okay.setOnAction(new EventHandler<ActionEvent>(){
		public void handle (ActionEvent t) {
		    center.setBackground(new Background(new BackgroundFill(Color.rgb((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255), .99), CornerRadii.EMPTY, Insets.EMPTY)));
		} // handle
	    });
	Label title = new Label("Your new \"one in a billion\" idea is:");
	title.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 20; -fx-text-fill: darkred;");
	Label idea = new Label("Your New Idea Here...");
	idea.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 30; -fx-text-fill: white;");
	top.getChildren().addAll(title);
	root.setTop(top);
	bottom.getChildren().addAll(bad, new Separator(), okay, new Separator(), good);
	root.setBottom(bottom);
	center.getChildren().addAll(idea);
	





	root.setCenter(center);
	root.setMaxWidth(800);
        root.setMaxHeight(460);
        root.setMinWidth(800);
        root.setMinHeight(460);
	//final stuff
	Scene scene = new Scene(root);
	stage.setMaxWidth(800);
	stage.setMaxHeight(485);
	stage.setMinWidth(800);
	stage.setMinHeight(485);
	stage.setTitle("Idea Bot!");
	stage.setScene(scene);
	stage.sizeToScene();
	stage.show();
	
    } //initUI
    

    public static void main(String[] args) {
      try {
        Application.launch(args);

      } catch (UnsupportedOperationException e) {
        System.out.println(e);
        System.err.println("If this is a DISPLAY problem, then your X server connection");
        System.err.println("has likely timed out. This can generally be fixed by logging");
        System.err.println("out and logging back in.");
        System.exit(1);
      } // try
    } // main

} // IdeaBot

