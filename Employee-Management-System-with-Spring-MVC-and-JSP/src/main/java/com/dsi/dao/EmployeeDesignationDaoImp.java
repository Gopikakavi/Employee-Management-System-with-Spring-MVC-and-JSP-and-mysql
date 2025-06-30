package com.dsi.dao;

import com.dsi.entity.DesignationDetails;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class EmployeeDesignationDaoImp implements EmployeeDesignationDao{
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
    @Override
    public void save(DesignationDetails designation) {
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(designation);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<DesignationDetails> getAllDetails() {
        EntityManager  entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        List<DesignationDetails> list = entityManager.createQuery("from DesignationDetails").getResultList();
        entityManager.getTransaction().commit();
        return list;
    }

    @Override
    public DesignationDetails getDesignationById(int id) {
        EntityManager  entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        DesignationDetails details = entityManager.find(DesignationDetails.class,id);
        return details;
    }

    @Override
    public void editDesignation(DesignationDetails designationDetails) {
        System.out.println(designationDetails.getD_Id());
        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(designationDetails);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteDesignation(int id) {
        EntityManager  entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(DesignationDetails.class,id));
        entityManager.getTransaction().commit();
    }
}
