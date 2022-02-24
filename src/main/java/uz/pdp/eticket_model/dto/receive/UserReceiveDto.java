package uz.pdp.eticket_model.dto.receive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserReceiveDto {
    @NotNull
    private String email;

    @NotNull
    private String phoneNumber;

    private String password;

    long passengerId;

}
