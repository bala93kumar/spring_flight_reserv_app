package com.balakumar.spring_flight_reserv_app.dto;

public class ReserVationUpdateRequest {

    private int id;
    private boolean checkedIn;
    private int noOfBags;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public boolean getCheckedIn() {
        return checkedIn;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public void setNoOfBags(int noOfBags) {
        this.noOfBags = noOfBags;
    }
}
