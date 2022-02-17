package uz.pdp.eticket_s_pro.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel {
    @Id
    long id ;

    @Column(name = "create_date")
    Date createDate;

    {
        createDate = new Date();
        long id =(long)(Math.random() * 10000+1);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
