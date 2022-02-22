package uz.pdp.eticket_model.dto.receive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainReceiveDTO {
        String trainName;
        List<CarDTO> cars;
        double priceByKM;
}
