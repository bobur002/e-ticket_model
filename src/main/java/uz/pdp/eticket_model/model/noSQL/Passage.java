package uz.pdp.eticket_model.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import uz.pdp.eticket_model.model.postgresql.BaseModel;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collation = "NoSql")
public class Passage extends BaseModelNoSql {
      LocalDate  departureDate;
      String from;
      String to;
      String trainNumber;
      Train train;
      List<Station> stations;
}
