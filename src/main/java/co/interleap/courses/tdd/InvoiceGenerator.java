package co.interleap.courses.tdd;

import java.util.List;

public class InvoiceGenerator {

    private List<Ride> rides;

    public InvoiceGenerator(List<Ride> rides) {
        this.rides = rides;
    }

    public int getTotalFare() {
        int totalFare = 0;

        for (Ride ride:rides){
            totalFare += ride.getFare();
        }
        return totalFare;
    }
    public int getNumberOfRides() {
        return rides.size();
    }

    public int getAverageFarePerRide() {
        return getTotalFare() / getNumberOfRides();
    }


}

