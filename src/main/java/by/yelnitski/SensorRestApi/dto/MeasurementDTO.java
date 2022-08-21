package by.yelnitski.SensorRestApi.dto;

import by.yelnitski.SensorRestApi.model.Sensor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class MeasurementDTO {

    @Min(value = -100, message = "value should be more -100")
    @Max(value = 100, message = "value should be less 100")
    @NotNull(message = "value should not null")
    private double value;

    @NotNull(message = "raining should not be null")
    private boolean raining;

    @NotNull(message = "sensor should not null")
    private Sensor sensor;
}
