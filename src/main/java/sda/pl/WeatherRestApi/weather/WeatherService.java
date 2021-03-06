package sda.pl.WeatherRestApi.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    @Autowired
    public WeatherService(WeatherRepository weatherRepository){
        this.weatherRepository = weatherRepository;
    }

    public List<Weather> getWeathers(){
        return weatherRepository.findAll();
    }

    public Weather addWeather(Weather weather) {
        return weatherRepository.save(weather);
    }
}
