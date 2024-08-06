package com.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.entity.EmployeeEntity;

@Stateless
public class EmployeeModel implements EmployeeRemote {

    @PersistenceContext(unitName = "JPA-DB")
    private EntityManager entityManager;

    @Override
    public String insertData(EmployeeEntity employee) throws Exception {
        entityManager.persist(employee);
        return "Record inserted...";
    }
}
