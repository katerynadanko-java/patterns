package behavioralPatterns.mediator.components;

import behavioralPatterns.mediator.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
