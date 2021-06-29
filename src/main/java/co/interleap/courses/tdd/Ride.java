package co.interleap.courses.tdd;

public class Ride {
    public static final int FARE_PER_KM = 10;
    public static final int FARE_PER_MINUTE = 1;
    private final int kilometers;
    private final int minutes;

    public Ride(int kilometers, int minutes) {
        this.kilometers = kilometers;
        this.minutes = minutes;
    }

    int getFare() {
        return kilometers * FARE_PER_KM + minutes * FARE_PER_MINUTE;
    }


}
