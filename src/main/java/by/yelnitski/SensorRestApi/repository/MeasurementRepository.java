package by.yelnitski.SensorRestApi.repository;

import by.yelnitski.SensorRestApi.model.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    public List<Measurement> findMeasurementByRainingIsTrue();

}
