package generativePatterns.abstractFactory.factories;

import generativePatterns.abstractFactory.buttons.Button;
import generativePatterns.abstractFactory.buttons.WindowsButton;
import generativePatterns.abstractFactory.checkboxes.Checkbox;
import generativePatterns.abstractFactory.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
