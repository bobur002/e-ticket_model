package uz.pdp.eticket_s_pro.model.postgresql;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import uz.pdp.eticket_s_pro.model.BaseModel;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
public class passenger extends BaseModel {
    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    String patronomyc;

    @Column(name = "birth_date")
    String birthDate;

    String gander;

    @Column(name = "document_type")
    String documentType;

    @Column(name = "document_number")
    String documentNumber;

    String country;

    @Transient
    long user_id;

    public passenger() {
    }

    public passenger(
            String firstName,
            String lastName,
            String patronomyc,
            String birthDate,
            String gander,
            String documentType,
            String documentNumber,
            String country,
            long user_id
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronomyc = patronomyc;
        this.birthDate = birthDate;
        this.gander = gander;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.country = country;
        this.user_id = user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronomyc() {
        return patronomyc;
    }

    public void setPatronomyc(String patronomyc) {
        this.patronomyc = patronomyc;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
