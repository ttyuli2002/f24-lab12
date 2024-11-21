package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private LengthScale lengthScale;

    public enum LengthScale {
        INCHES, MILLIMETERS
    }

    /**
     * Sets the length scale for rainfall.
     *
     * @param lengthScale the preferred length scale (INCHES or MILLIMETERS)
     */
    public void setLengthScale(LengthScale lengthScale) {
        this.lengthScale = lengthScale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     *
     * @return the rainfall amount in the preferred scale
     */
    public double getRainfall() {
        double wsRainfall = weatherService.getRainfall();
        if (lengthScale == LengthScale.INCHES) {
            return wsRainfall / 25.4; // Convert millimeters to inches
        } else {
            return wsRainfall; // Already in millimeters
        }
    }
}
