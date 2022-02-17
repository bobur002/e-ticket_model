package uz.pdp.eticket_s_pro.model.postgresql;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.Hibernate;
import uz.pdp.eticket_s_pro.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.util.Objects;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseModel {
    String email;
    @Column(name = "phone_number")
    String phoneNumber;
    String password;
    @Transient
    long passengerId;

    public User() {

    }


    public User(String email, String phoneNumber, String password, long passengerId) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.passengerId = passengerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }
}
