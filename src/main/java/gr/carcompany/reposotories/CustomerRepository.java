package gr.carcompany.reposotories;

import gr.carcompany.models.Customer;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class CustomerRepository implements Repository<Customer, Long> {
    protected final EntityManager entityManager;

    public CustomerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Customer> findById(Long id) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer == null) return Optional.empty();
        return Optional.of(customer);
    }

    @Override
    public List findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("from Customer", Customer.class);
        return query.getResultList();
    }

    @Override
    public Optional<Customer> save(Customer c) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
            return Optional.of(c);
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println("process not completed");
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        Customer propertyOwner = entityManager.find(Customer.class, id);
        if (propertyOwner != null) {
            try{
                entityManager.getTransaction().begin();
                entityManager.remove(propertyOwner);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                entityManager.getTransaction().rollback();
                System.out.println("process not completed");
            }
            return true;
        }
        return false;
    }

    public Customer findByPhoneNumber(Long pNumber) {
        TypedQuery<Customer> typedQuery = entityManager.createQuery("from Customer where pNumber =: data", Customer.class);
        typedQuery.setParameter("data", pNumber);
        return typedQuery.getSingleResult();
    }
}
