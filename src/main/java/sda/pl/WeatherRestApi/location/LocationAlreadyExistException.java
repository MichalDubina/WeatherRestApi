package sda.pl.WeatherRestApi.location;

public class LocationAlreadyExistException extends RuntimeException {

    public LocationAlreadyExistException(String placeName, float longi, float lat) {
        super(String.format("Location already exist!: %s, %f, %f",
                placeName, longi, lat));
    }
}
