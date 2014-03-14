/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.CustomerPurchase.Cash;
import com.tp2domainmodel.domainmodel.services.crud.CashCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wesley
 */
public class CashCrudServiceImpl implements CashCrudService{
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cash find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Cash persist(Cash entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cash merge(Cash entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Cash remove(Cash entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Cash> findAll() {
        return null;
    }
}
