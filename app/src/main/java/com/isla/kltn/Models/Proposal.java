package com.isla.kltn.Models;

import java.util.Date;

/**
 * Created by isla on 12/1/17.
 */

public class Proposal {

    private String name;
    private String detail;
    private String pickUpLocation;
    private Date pickUpTime;
    private String destination;
    private Date useFrom;
    private Date useTo;


    public Proposal(String name, String detail, String pickUpLocation, Date pickUpTime, String destination, Date useFrom, Date useTo) {
        this.name = name;
        this.detail = detail;
        this.pickUpLocation = pickUpLocation;
        this.pickUpTime = pickUpTime;
        this.destination = destination;
        this.useFrom = useFrom;
        this.useTo = useTo;
    }

    public Proposal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getUseFrom() {
        return useFrom;
    }

    public void setUseFrom(Date useFrom) {
        this.useFrom = useFrom;
    }

    public Date getUseTo() {
        return useTo;
    }

    public void setUseTo(Date useTo) {
        this.useTo = useTo;
    }
}
