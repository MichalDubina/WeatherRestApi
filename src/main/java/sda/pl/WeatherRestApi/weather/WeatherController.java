package sda.pl.WeatherRestApi.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public List<Weather> getAll() {
        return weatherService.getWeathers();
    }

    @PostMapping
    public Weather add(@RequestBody Weather weather) {
         return weatherService.addWeather(weather);
    }
}
