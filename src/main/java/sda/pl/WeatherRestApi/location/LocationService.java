package sda.pl.WeatherRestApi.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    @Autowired
    public LocationService(LocationRepository locationRepository){
        this.locationRepository = locationRepository;
    }

    public Location add(Location location) {
        locationRepository.findByPlaceNameAndLongiAndLat(
                location.getPlaceName(),
                location.getLongi(),
                location.getLat())
                .ifPresent(l -> {
                    throw new LocationAlreadyExistException(
                            location.getPlaceName(),
                            location.getLongi(),
                            location.getLat());
                });
        return locationRepository.save(location);
    }

    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    public Location remove(String id) {
        Location location = locationRepository.findById(id)
                .<NoSuchElementException>orElseThrow(() -> {
                    throw new NoSuchElementException();
                });
        locationRepository.deleteById(id);
        return location;
    }
}
