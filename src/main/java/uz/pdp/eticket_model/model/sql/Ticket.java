package uz.pdp.eticket_model.model.sql;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Ticket extends BaseModel {

    @Transient
    long passengerId;

    @Transient
    long childPassengerId;

    @Column(name = "passenger_type")
    String passengerType;

    @Column(name = "from_station")
    String fromStation;

    @Column(name = "to_station")
    String toStation;

    @Column(name = "train_number")
    String trainNumber;

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


}
