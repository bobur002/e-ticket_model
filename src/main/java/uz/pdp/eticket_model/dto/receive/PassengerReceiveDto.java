package uz.pdp.eticket_model.dto.receive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Transient;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassengerReceiveDto {

    private String firstName;


    private String lastName;

    private String patronomyc;


    private String birthDate;

    private String gander;

    private String documentType;


    private String documentNumber;

    private String country;

    private long user_id;


}
