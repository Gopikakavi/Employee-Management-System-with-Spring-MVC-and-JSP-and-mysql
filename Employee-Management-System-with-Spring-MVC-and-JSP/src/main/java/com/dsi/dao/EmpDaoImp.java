package com.dsi.dao;

import com.dsi.entity.EmployeeDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmpDaoImp implements EmpDao{

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
    @Override
    public void save(EmployeeDetails details) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(details);
        entityManager.getTransaction().commit();
    }

    @Override
    public EmployeeDetails getDetailsById(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        EmployeeDetails employeeDetails = entityManager.find(EmployeeDetails.class,id);
        entityManager.getTransaction().commit();
        return employeeDetails;
    }

    @Override
    public List<EmployeeDetails> getAllEmp() {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<EmployeeDetails> detailsList = entityManager.createQuery("from EmployeeDetails").getResultList();
        entityManager.getTransaction().commit();
        return detailsList;
    }

    @Override
    public void update(EmployeeDetails details) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(details);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(EmployeeDetails.class,id));
        entityManager.getTransaction().commit();
    }

    @Override
    public List<EmployeeDetails> getAllEmpByDept(String dept) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<EmployeeDetails> detailsList = entityManager.
                createQuery("from EmployeeDetails where department = ?1")
                .setParameter(1, dept)
                .getResultList();
        entityManager.getTransaction().commit();
        return detailsList;
    }
}
