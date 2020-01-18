package sda.pl.WeatherRestApi.weather;

import javax.persistence.*;

@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private float temp;
    private float humidity;
    private float pressure;
    private String date;
    @Column(name = "wind_direction")
    private String windDirection;
    @Column(name = "wind_speed")
    private float windSpeed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }
}
