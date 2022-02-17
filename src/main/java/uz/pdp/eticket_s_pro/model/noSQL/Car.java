package uz.pdp.eticket_s_pro.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_s_pro.model.BaseModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car extends BaseModel {
    String carType;
    double price;
    List<Seat> seats;

}
