package uk.ac.cam.group18.WeatherApp.ui.hourly;

import javafx.event.ActionEvent;
import uk.ac.cam.group18.WeatherApp.Main;

public class HourlyController {
    public void backPressed(ActionEvent e) {
        Main.application.setSceneHome();
    }
}
