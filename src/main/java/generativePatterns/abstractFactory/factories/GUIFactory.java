package generativePatterns.abstractFactory.factories;

import generativePatterns.abstractFactory.buttons.Button;
import generativePatterns.abstractFactory.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
