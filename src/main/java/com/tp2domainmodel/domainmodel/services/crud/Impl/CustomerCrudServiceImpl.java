/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Customer;
import com.tp2domainmodel.domainmodel.services.crud.CustomerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wesley
 */
public class CustomerCrudServiceImpl implements CustomerCrudService{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Customer find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Customer persist(Customer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Customer merge(Customer entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Customer remove(Customer entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Customer> findAll() {
        return null;
    }

}
