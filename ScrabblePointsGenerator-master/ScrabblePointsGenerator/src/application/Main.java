package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	static Scene startPage,mainPage,rulePage,prevWordsPage;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Scrabble Points Generator");
			
			Parent root1 = FXMLLoader.load(getClass().getResource("/application/startPage.fxml"));
			startPage = new Scene(root1);
		//	startPage.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Parent root2 = FXMLLoader.load(getClass().getResource("/application/mainPage.fxml"));
			mainPage = new Scene(root2);
			Parent root3 = FXMLLoader.load(getClass().getResource("/application/rulePage.fxml"));
			rulePage = new Scene(root3);
			Parent root4 = FXMLLoader.load(getClass().getResource("/application/prevWordsPage.fxml"));
			prevWordsPage = new Scene(root4);
			
			primaryStage.setScene(startPage);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

	public static Scene getStartPage() {
		return startPage;
	}

	public static Scene getMainPage() {
		return mainPage;
	}

	public static Scene getRulePage() {
		return rulePage;
	}

	public static Scene getPrevWordsPage() {
		return prevWordsPage;
	}

	
}
