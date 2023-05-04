import Explorers.*;
import Planets.*;

public class App {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet saturn = new Saturn();
        Planet mercury = new Mercury();
        Planet neptune = new Neptune();
        Planet earth = new Earth();

        Explorer astronaut = new HumanExplorer();
        Explorer rover = new RobotExplorer();

        mars.accept(astronaut);
        saturn.accept(astronaut);
        mercury.accept(astronaut);
        neptune.accept(astronaut);
        earth.accept(astronaut);

        mars.accept(rover);
        saturn.accept(rover);
        mercury.accept(rover);
        neptune.accept(rover);
        earth.accept(rover);
    }
}