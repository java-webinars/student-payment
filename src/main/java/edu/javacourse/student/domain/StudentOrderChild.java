package edu.javacourse.student.domain;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "jc_student_child")
@AssociationOverrides({
        @AssociationOverride(name = "address.street", joinColumns = @JoinColumn(name = "c_street_code"))
})
@AttributeOverrides({
        @AttributeOverride(name = "surName", column = @Column(name = "c_sur_name")),
        @AttributeOverride(name = "givenName", column = @Column(name = "c_given_name")),
        @AttributeOverride(name = "patronymic", column = @Column(name = "c_patronymic")),
        @AttributeOverride(name = "dateOfBirth", column = @Column(name = "c_date_of_birth")),
        @AttributeOverride(name = "address.postCode", column = @Column(name = "c_post_index")),
        @AttributeOverride(name = "address.building", column = @Column(name = "c_building")),
        @AttributeOverride(name = "address.extension", column = @Column(name = "c_extension")),
        @AttributeOverride(name = "address.apartment", column = @Column(name = "c_apartment"))
})
public class StudentOrderChild extends Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_child_id")
    private Long studentOrderChildId;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "student_order_id")
    private StudentOrder studentOrder;
    @Column(name = "c_certificate_number")
    private String certificateNumber;
    @Column(name = "c_certificate_date")
    private LocalDate certificateDate;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "c_register_office_id")
    private RegisterOffice registerOffice;

    public Long getStudentOrderChildId() {
        return studentOrderChildId;
    }

    public void setStudentOrderChildId(Long studentOrderChildId) {
        this.studentOrderChildId = studentOrderChildId;
    }

    public StudentOrder getStudentOrder() {
        return studentOrder;
    }

    public void setStudentOrder(StudentOrder studentOrder) {
        this.studentOrder = studentOrder;
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    public RegisterOffice getRegisterOffice() {
        return registerOffice;
    }

    public void setRegisterOffice(RegisterOffice registerOffice) {
        this.registerOffice = registerOffice;
    }
}
