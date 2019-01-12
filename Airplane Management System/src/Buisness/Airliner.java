/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.Date;

/**
 *
 * @author gadep
 */
public class Airliner {
    
    private String airlineName;
    private String airlineType;
    private double seatCapacity;
     FlightScheduleDirectory flightScheduleDirectory;
    private int numAirplanes;

    public int getNumAirplanes() {
        return numAirplanes;
    }

    public void setNumAirplanes(int numAirplanes) {
        this.numAirplanes = numAirplanes;
    }
    
    
    
    public Airliner()
            {
                flightScheduleDirectory = new FlightScheduleDirectory();
               
            }

    public FlightScheduleDirectory getFlightScheduleDirectory() {
        return flightScheduleDirectory;
    }

    public void setFlightScheduleDirectory(FlightScheduleDirectory flightScheduleDirectory) {
        this.flightScheduleDirectory = flightScheduleDirectory;
    }
    public double getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(double seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
   

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineType() {
        return airlineType;
    }

    public void setAirlineType(String airlineType) {
        this.airlineType = airlineType;
    }

   @Override
    public String toString() {
        return this.getAirlineName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}


