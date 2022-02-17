package uz.pdp.eticket_s_pro.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import net.bytebuddy.description.modifier.FieldManifestation;
import uz.pdp.eticket_s_pro.model.BaseModel;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Passage extends BaseModel {
      LocalDate  departureDate;
      String from;
      String to;
      String trainNumber;
      Train train;
      List<Station> stations;
}
