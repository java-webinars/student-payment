package edu.javacourse.student.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jc_register_office")
public class RegisterOffice
{
    @Id
    @Column(name = "r_office_id")
    private Long registerOfficeId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "r_office_area_id")
    private CountryArea countryArea;
    @Column(name = "r_office_name")
    private String registerOfficeName;

    public Long getRegisterOfficeId() {
        return registerOfficeId;
    }

    public void setRegisterOfficeId(Long registerOfficeId) {
        this.registerOfficeId = registerOfficeId;
    }

    public CountryArea getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(CountryArea countryArea) {
        this.countryArea = countryArea;
    }

    public String getRegisterOfficeName() {
        return registerOfficeName;
    }

    public void setRegisterOfficeName(String registerOfficeName) {
        this.registerOfficeName = registerOfficeName;
    }
}
