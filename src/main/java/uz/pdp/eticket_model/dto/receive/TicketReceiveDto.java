package uz.pdp.eticket_model.dto.receive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketReceiveDto {


    private long passengerId;

    private long childPassengerId;

    private String passengerType;

    private String fromStation;

    private String toStation;


    private String trainNumber;


    private String trainName;


    private String carType;


    private String carNumber;


    private String seatNumber;

    double price;


    private String arrivalDateTime;


    private String departureDateTime;

}
