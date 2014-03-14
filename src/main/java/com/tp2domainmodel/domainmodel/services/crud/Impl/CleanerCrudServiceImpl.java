/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tp2domainmodel.domainmodel.services.crud.Impl;

import com.tp2domainmodel.domainmodel.model.Staff.Cleaner;
import com.tp2domainmodel.domainmodel.services.crud.CleanerCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Wesley
 */
public class CleanerCrudServiceImpl implements CleanerCrudService{
    
      @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Cleaner find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Cleaner persist(Cleaner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Cleaner merge(Cleaner entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Cleaner remove(Cleaner entity) {

        return null;

    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Cleaner> findAll() {
        return null;
    }

   
    
}
