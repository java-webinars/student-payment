package edu.javacourse.student.business;

import edu.javacourse.student.dao.StudentOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentOrderService
{
    @Autowired
    private StudentOrderRepository dao;

    @Transactional
    public void test() {
        dao.findAll();
    }
}
