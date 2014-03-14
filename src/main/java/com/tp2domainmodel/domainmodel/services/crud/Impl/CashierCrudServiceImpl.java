/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.Staff.Cashier;
import com.tp2domainmodel.domainmodel.services.crud.CashierCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wesley
 */
public class CashierCrudServiceImpl implements CashierCrudService{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cashier find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Cashier persist(Cashier entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cashier merge(Cashier entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Cashier remove(Cashier entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Cashier> findAll() {
        return null;
    }
}
