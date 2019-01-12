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
public class FlightSchedule {
    private String from;
    private String To;
    private String DateofJourney;
    private int seat;
    private String item;
    private String ArrivalTime;
     

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDateofJourney() {
        return DateofJourney;
    }

    public void setDateofJourney(String DateofJourney) {
        this.DateofJourney = DateofJourney;
    }
    private String DepartureTime;
    

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }
     private int TimeofJourney;

    public int getTimeofJourney() {
        return TimeofJourney;
    }

    public void setTimeofJourney(int TimeofJourney) {
        this.TimeofJourney = TimeofJourney;
    }

   

   
   
    
    
}
