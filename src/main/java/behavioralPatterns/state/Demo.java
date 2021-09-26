package behavioralPatterns.state;

import behavioralPatterns.state.ui.Player;
import behavioralPatterns.state.ui.UI;


/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
