package uz.pdp.eticket_s_pro.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_s_pro.model.BaseModel;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Time extends BaseModel {
    Date departureTime;
    Date arrivalTime;
    String state;
}
