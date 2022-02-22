package uz.pdp.eticket_model.dto.receive;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarReceiveDTO {

    @NotBlank
    String carType;

    @NotNull
    double price;

    @NotNull
    @Size(min = 10,max = 100)
    int seatCount;

}
