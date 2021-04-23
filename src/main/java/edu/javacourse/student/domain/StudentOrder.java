package edu.javacourse.student.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jc_student_order")
public class StudentOrder
{
    @Id
    @Column(name = "student_order_id")
    private Long studentOrderId;

    public Long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(Long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }
}
