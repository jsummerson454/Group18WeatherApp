package uk.ac.cam.group18.WeatherApp.daily;

import javafx.event.ActionEvent;
import uk.ac.cam.group18.WeatherApp.Main;

public class DailyController {
    public void backPressed(ActionEvent e) {
        Main.application.setSceneHome();
    }
}
