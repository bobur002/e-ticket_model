package uz.pdp.eticket_model.model.noSQL;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collation = "NoSql")
public abstract class BaseModelNoSql {
    @Id
    private String id;

    private Date createdDate;

    {
        createdDate = new Date();
    }
}
