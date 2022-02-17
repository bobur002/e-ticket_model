package uz.pdp.eticket_s_pro.model.postgresql;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_s_pro.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Ticket  extends BaseModel {

    @Transient
    long passengerId;

    @Transient
    long childPassengerId;

    @Column(name = "passenger_type")
    String passengerType;

    String from;

    String to;

    @Column(name = "train_name")
    String trainName;

    @Column(name = "car_type")
    String carType;

    @Column(name = "car_number")
    String carNumber;

    @Column(name = "seat_number")
    String seatNumber;

    double price;

    @Column(name = "arrival_date_time")
    String arrivalDateTime;

    @Column(name = "departure_date_time")
    String departureDateTime;

    @Column(name = "passage_number")
    String passageNumber;

    public Ticket() {

    }

    public Ticket(long passengerId,
                  long childPassengerId,
                  String passengerType,
                  String from,
                  String to,
                  String trainName,
                  String carType,
                  String carNumber,
                  String seatNumber,
                  double price,
                  String arrivalDateTime,
                  String departureDateTime,
                  String passageNumber) {
        this.passengerId = passengerId;
        this.childPassengerId = childPassengerId;
        this.passengerType = passengerType;
        this.from = from;
        this.to = to;
        this.trainName = trainName;
        this.carType = carType;
        this.carNumber = carNumber;
        this.seatNumber = seatNumber;
        this.price = price;
        this.arrivalDateTime = arrivalDateTime;
        this.departureDateTime = departureDateTime;
        this.passageNumber = passageNumber;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public long getChildPassengerId() {
        return childPassengerId;
    }

    public void setChildPassengerId(long childPassengerId) {
        this.childPassengerId = childPassengerId;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getPassageNumber() {
        return passageNumber;
    }

    public void setPassageNumber(String passageNumber) {
        this.passageNumber = passageNumber;
    }
}
