package by.yelnitski.SensorRestApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/measurements")
public class MeasurementController {
    //GET /measurements вернем все измерения бд
    //GET /measurements/rainyDaysCount возвр кол-во дождл дней из бд
    //Post /measurement/add добавляет новое измерение


}
