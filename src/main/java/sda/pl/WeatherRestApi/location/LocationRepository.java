package sda.pl.WeatherRestApi.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {
    Optional<Location> findByPlaceNameAndLongiAndLat(String placeName, float longi, float lat);
}
