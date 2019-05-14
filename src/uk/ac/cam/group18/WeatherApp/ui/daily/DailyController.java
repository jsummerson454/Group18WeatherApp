package uk.ac.cam.group18.WeatherApp.ui.daily;

import javafx.event.ActionEvent;
import javafx.stage.Stage;
import uk.ac.cam.group18.WeatherApp.Main;
import uk.ac.cam.group18.WeatherApp.model.SceneName;

public class DailyController {

    private Stage stage;

    public DailyController(Stage stage) {
        this.stage = stage;
    }

    public void backPressed(ActionEvent e) {
        stage.setScene(Main.getScenes().get(SceneName.HOME));
    }
}
