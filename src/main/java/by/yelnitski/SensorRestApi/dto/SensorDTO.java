package by.yelnitski.SensorRestApi.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class SensorDTO {

    @NotEmpty(message = "name should not empty")
    @Size(min = 3, max = 30, message = "Name should be from 3 to 30 characters")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
