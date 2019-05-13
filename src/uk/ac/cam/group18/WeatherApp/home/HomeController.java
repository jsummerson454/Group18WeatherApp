package uk.ac.cam.group18.WeatherApp.home;

import javafx.event.ActionEvent;
import uk.ac.cam.group18.WeatherApp.Main;

public class HomeController {
    public void dailyPressed(ActionEvent e) {
        Main.application.setSceneDaily();
    }

    public void hourlyPressed(ActionEvent e) {
        Main.application.setSceneHourly();
    }
}
