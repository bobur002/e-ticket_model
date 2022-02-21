package uz.pdp.eticket_model.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_model.model.BaseModel;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Train extends BaseModel {
    String trainName;
    List<Car> Cars;
    double priceByKM;
}