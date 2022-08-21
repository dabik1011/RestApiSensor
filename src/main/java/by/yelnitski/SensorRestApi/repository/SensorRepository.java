package by.yelnitski.SensorRestApi.repository;

import by.yelnitski.SensorRestApi.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}
