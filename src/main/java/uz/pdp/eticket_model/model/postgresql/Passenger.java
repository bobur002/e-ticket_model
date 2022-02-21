package uz.pdp.eticket_model.model.postgresql;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_model.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Passenger extends BaseModel {
    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    String patronomyc;

    @Column(name = "birth_date")
    String birthDate;

    String gander;

    @Column(name = "document_type")
    String documentType;

    @Column(name = "document_number")
    String documentNumber;

    String country;

    @Transient
    long user_id;

}
