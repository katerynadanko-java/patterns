package generativePatterns.builder.builders;

import generativePatterns.builder.cars.CarType;
import generativePatterns.builder.components.Engine;
import generativePatterns.builder.components.GPSNavigator;
import generativePatterns.builder.components.Transmission;
import generativePatterns.builder.components.TripComputer;


/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
