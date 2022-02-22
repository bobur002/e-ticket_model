package uz.pdp.eticket_model.model.noSQL;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document
public class Station {
    String name;
    Date arrivalTime;
    Date departureTime;
}
