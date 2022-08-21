package by.yelnitski.SensorRestApi.service;

import by.yelnitski.SensorRestApi.model.Measurement;
import by.yelnitski.SensorRestApi.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class MeasurementService {

    private final MeasurementRepository measurementRepository;

    @Autowired
    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public List<Measurement> findAll() {
        return measurementRepository.findAll();
    }

    public int rainyDaysCount() {
        return measurementRepository.findMeasurementByRainingIsTrue().size();
    }


}
