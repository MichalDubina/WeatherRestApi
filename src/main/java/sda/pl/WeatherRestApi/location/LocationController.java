package sda.pl.WeatherRestApi.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/location")
@RestController
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> getAll() {
        return locationService.getAll();
    }

    @PostMapping
    public Location add(@RequestBody Location location) {
        return locationService.add(location);
    }

    @DeleteMapping("/{id}")
    public Location delete(@PathVariable String id){
        return locationService.remove(id);
    }

}
