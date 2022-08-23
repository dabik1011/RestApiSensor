package by.yelnitski.SensorRestApi.service;

import by.yelnitski.SensorRestApi.model.Sensor;
import by.yelnitski.SensorRestApi.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
public class SensorService {

    private final SensorRepository sensorRepository;

    @Autowired
    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

//    public List<Sensor> findAll() {
//        return sensorRepository.findAll();
//    }

    @Transactional
    public void save(Sensor sensor) {
        enrichSensor(sensor);
        sensorRepository.save(sensor);
    }
    @Transactional
    public void update(int id, Sensor updateSensor) {
        updateSensor.setId(id);
        sensorRepository.save(updateSensor);
    }

    private void enrichSensor(Sensor sensor) {
        sensor.setCreatedAt(LocalDate.now());
    }

    public Optional<Sensor> getSensorByName(String name) {
        return sensorRepository.findSensorByName(name).stream().findAny();
    }

    public List<Sensor> findAll() {
        return sensorRepository.findAll();
    }
}
