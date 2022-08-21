package by.yelnitski.SensorRestApi.controller;

import by.yelnitski.SensorRestApi.dto.SensorDTO;
import by.yelnitski.SensorRestApi.model.Sensor;
import by.yelnitski.SensorRestApi.service.SensorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/sensors")
public class SensorController {

    private final SensorService sensorService;
    private final ModelMapper modelMapper;

    @Autowired
    public SensorController(SensorService sensorService, ModelMapper modelMapper) {
        this.sensorService = sensorService;
        this.modelMapper = modelMapper;
    }
    //Post /sensors/registration доб новый сеносор в таблицу имя уникально

    @PostMapping("/registration")
    public ResponseEntity<HttpStatus> create(@RequestBody @Valid SensorDTO sensorDTO,
                                             BindingResult bindingResult){

        //Обработка исключений
         if(bindingResult.hasErrors()) {
            // throw new Exception();
         }

        sensorService.registration(convertToSensor(sensorDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    private Sensor convertToSensor(SensorDTO sensorDTO) {
        return modelMapper.map(sensorDTO, Sensor.class);
    }

//    private SensorDTO convertToSensorDTO(Sensor sensor) {
//        return modelMapper.map(sensor, SensorDTO.class);
//    }

}
