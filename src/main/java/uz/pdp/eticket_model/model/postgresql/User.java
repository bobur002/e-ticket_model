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
public class User extends BaseModel {
    String email;

    @Column(name = "phone_number")
    String phoneNumber;

    String password;

    @Transient
    long passengerId;


}
