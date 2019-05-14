package uk.ac.cam.group18.WeatherApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Main application;
    Stage window;
    Scene home, daily, hourly, settings;

    public void setSceneHome() {
        window.setScene(home);
    }

    public void setSceneDaily() {
        window.setScene(daily);
    }

    public void setSceneSettings() {
        window.setScene(settings);
    }

    public void setSceneHourly() {
        window.setScene(hourly);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        //initialisation
        application = this;
        window = primaryStage;

        Parent homeRoot = FXMLLoader.load(getClass().getResource("ui/home/home.fxml"));
        home = new Scene(homeRoot, 360, 640);

        Parent dailyRoot = FXMLLoader.load(getClass().getResource("ui/daily/daily.fxml"));
        daily = new Scene(dailyRoot, 360, 640);

        Parent hourlyRoot = FXMLLoader.load(getClass().getResource("ui/hourly/hourly.fxml"));
        hourly = new Scene(hourlyRoot, 360, 640);

        Parent settingsRoot = FXMLLoader.load(getClass().getResource("ui/settings/settings.fxml"));
        settings = new Scene(settingsRoot, 360, 640);

        window.setTitle("Weather App");
        window.setScene(home);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}