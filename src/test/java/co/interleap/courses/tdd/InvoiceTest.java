package co.interleap.courses.tdd;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvoiceTest {

    @Test
    public void testInvoiceZeroKilometerAndZeroMinutes(){

            List<Ride> rides = Collections.singletonList(new Ride(0, 0));
            InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);
            assertEquals(0,invoiceGenerator.getTotalFare());
            assertEquals(0,invoiceGenerator.getAverageFarePerRide());
            assertEquals(1,invoiceGenerator.getNumberOfRides());

    }

    @Test
    public void testInvoiceZeroKilometerAndMinutes(){

        List<Ride> rides = Collections.singletonList(new Ride(0, 2));
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);
        assertEquals(2,invoiceGenerator.getTotalFare());
        assertEquals(2,invoiceGenerator.getAverageFarePerRide());
        assertEquals(1,invoiceGenerator.getNumberOfRides());

    }

    @Test
    public void testInvoiceKilometerAndMinutes(){

        List<Ride> rides = Collections.singletonList(new Ride(4, 10));
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);
        assertEquals(50,invoiceGenerator.getTotalFare());
        assertEquals(50,invoiceGenerator.getAverageFarePerRide());
        assertEquals(1,invoiceGenerator.getNumberOfRides());
    }

    @Test
    public void testInvoiceMultipleRidesKilometerAndMinutes(){

        List<Ride> rides = Arrays.asList(new Ride(4, 10),new Ride(7, 10));
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(rides);
        assertEquals(130,invoiceGenerator.getTotalFare());
        assertEquals(65,invoiceGenerator.getAverageFarePerRide());
        assertEquals(2,invoiceGenerator.getNumberOfRides());
    }
}
