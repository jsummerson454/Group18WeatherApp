package uk.ac.cam.group18.WeatherApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.ac.cam.group18.WeatherApp.model.SceneName;
import uk.ac.cam.group18.WeatherApp.ui.daily.DailyController;
import uk.ac.cam.group18.WeatherApp.ui.home.HomeController;
import uk.ac.cam.group18.WeatherApp.ui.hourly.HourlyController;
import uk.ac.cam.group18.WeatherApp.ui.settings.SettingsController;

import java.util.HashMap;
import java.util.Map;

public class Main extends Application {
    private static Map<SceneName, Scene> scenes = new HashMap<>();
    public static Map<SceneName, Scene> getScenes() {
        return scenes;
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        //initialisation
        FXMLLoader loader;

        HomeController homeController = new HomeController(primaryStage);
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/home/home.fxml"));
        loader.setController(homeController);
        Parent homeRoot = loader.load();
        scenes.put(SceneName.HOME, new Scene(homeRoot, 360, 640));

        DailyController dailyController = new DailyController(primaryStage);
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/daily/daily.fxml"));
        loader.setController(dailyController);
        Parent dailyRoot = loader.load();
        scenes.put(SceneName.DAILY, new Scene(dailyRoot, 360, 640));

        HourlyController hourlyController = new HourlyController(primaryStage);
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/hourly/hourly.fxml"));
        loader.setController(hourlyController);
        Parent hourlyRoot = loader.load();
        scenes.put(SceneName.HOURLY, new Scene(hourlyRoot, 360, 640));

        SettingsController settingsController = new SettingsController(primaryStage);
        loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ui/settings/settings.fxml"));
        loader.setController(settingsController);
        Parent settingsRoot = loader.load();
        scenes.put(SceneName.SETTINGS, new Scene(settingsRoot, 360, 640));

        primaryStage.setTitle("Weather App");
        primaryStage.setScene(scenes.get(SceneName.HOME));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}