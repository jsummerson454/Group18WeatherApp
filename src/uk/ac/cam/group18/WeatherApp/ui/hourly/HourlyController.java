package uk.ac.cam.group18.WeatherApp.ui.hourly;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import uk.ac.cam.group18.WeatherApp.Main;
import uk.ac.cam.group18.WeatherApp.model.SceneName;

public class HourlyController {

    private Stage stage;

    public HourlyController(Stage stage) {
        this.stage = stage;
    }

    public void backPressed(ActionEvent e) {
        stage.setScene(Main.getScenes().get(SceneName.HOME));
    }
}
