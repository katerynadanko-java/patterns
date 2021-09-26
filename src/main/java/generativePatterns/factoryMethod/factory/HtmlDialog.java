package generativePatterns.factoryMethod.factory;

import generativePatterns.factoryMethod.buttons.Button;
import generativePatterns.factoryMethod.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
