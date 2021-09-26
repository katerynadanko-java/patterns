package generativePatterns.factoryMethod.factory;

import generativePatterns.factoryMethod.buttons.Button;
import generativePatterns.factoryMethod.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
