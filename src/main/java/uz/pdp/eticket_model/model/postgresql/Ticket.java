package uz.pdp.eticket_model.model.postgresql;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket  extends BaseModel {

    @Transient
    long passengerId;

    @Transient
    long childPassengerId;

    @Column(name = "passenger_type")
    String passengerType;

    String from;

    String to;

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
