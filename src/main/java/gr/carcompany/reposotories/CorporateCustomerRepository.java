package gr.carcompany.reposotories;

import gr.carcompany.models.CorporateCustomer;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class CorporateCustomerRepository extends CustomerRepository {

    public CorporateCustomerRepository(EntityManager entityManager) {
        super(entityManager);
    }

    public CorporateCustomer findCorporateCustomerByContactPhone(Long contactPhone){
        TypedQuery<CorporateCustomer> typedQuery = entityManager.createQuery("from Customer where contactPhone =: data", CorporateCustomer.class);
        typedQuery.setParameter("data", contactPhone);
        return typedQuery.getSingleResult();
    }

}
