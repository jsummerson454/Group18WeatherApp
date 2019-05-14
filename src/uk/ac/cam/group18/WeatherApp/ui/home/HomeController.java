package uk.ac.cam.group18.WeatherApp.ui.home;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import uk.ac.cam.group18.WeatherApp.Main;
import uk.ac.cam.group18.WeatherApp.model.SceneName;

public class HomeController {

    private Stage stage;

    public HomeController(Stage stage) {
        this.stage = stage;
    }

    public void dailyPressed(ActionEvent e) {
        stage.setScene(Main.getScenes().get(SceneName.DAILY));
    }

    public void hourlyPressed(ActionEvent e) {
        stage.setScene(Main.getScenes().get(SceneName.HOURLY));
    }
}
